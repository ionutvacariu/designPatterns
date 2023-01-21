package spring.core.custom.impl.interceptors;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("no ni la el ... aici e inainte de metoda .. ptr un transactional, aici am incepe try - ul");

        Object result = method.invoke(target, args);

        System.out.println("no ni la el ... aici e dupa ce s-a apelat.. ptr un transactional, aici am pune catch-ul si rollback-ul");
        return result;
    }
}
