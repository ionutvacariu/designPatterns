package spring.core.custom.impl;

import spring.core.custom.impl.annotation.MyCustomAutowired;
import spring.core.custom.impl.annotation.MySpecialComponent;
import spring.core.custom.impl.interceptors.MyInvocationHandler;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.*;

public class Context {

    public Map<String, Object> context = new HashMap<>();

    private static final Context instance = new Context();

    public static Context getInstance() {
        return instance;
    }

    public void populateContext() {
        List<Class<?>> classes = getClasses(Context.class.getPackageName());
        classes.forEach(this::createContextWithProxyBeans);
        classes.forEach(this::autowireFields);
    }

    private void autowireFields(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field f : declaredFields) {
            if (f.isAnnotationPresent(MyCustomAutowired.class)) {
                Object beanToAutoWire = getProxyFromContext(f.getName(), f.getType());
                Object beanWhereToInject = context.get(cls.getSimpleName().toUpperCase());
                f.setAccessible(true);
                try {
                    f.set(beanWhereToInject, beanToAutoWire);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                f.setAccessible(false);

            }
        }
    }

    private void createContextWithProxyBeans(Class<?> s) {
        if (s.isAnnotationPresent(MySpecialComponent.class)) {
            try {
                context.put(s.getSimpleName().toUpperCase(), s.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public <T> T getProxyFromContext(String name, Class<T> type) {
        Object s = this.context.get(name.toUpperCase());
        InvocationHandler handler = new MyInvocationHandler(s);

        if (s.getClass().getInterfaces().length > 0) {
            return (T) Proxy.newProxyInstance(
                    s.getClass().getClassLoader(),
                    new Class[]{s.getClass().getInterfaces()[0]},
                    handler);

        }
        return (T) s;
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(s.getClass());
//        enhancer.setCallback(new MyServiceMethodInterceptor());
//        return (T) enhancer.create();
    }

    public static List<Class<?>> getClasses(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        try {
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packageName.replace(".", "/"));
            while (resources.hasMoreElements()) {
                File directory = new File(resources.nextElement().getFile());
                for (File file : directory.listFiles()) {
                    if (file.isDirectory()) {
                        classes.addAll(getClasses(packageName + "." + file.getName()));
                    } else if (file.getName().endsWith(".class")) {
                        Class<?> aClass = Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6));
                        classes.add(aClass);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return classes;
    }
}
