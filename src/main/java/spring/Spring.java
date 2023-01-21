package spring;

import spring.interceptors.MyInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Spring {
    public static void main(String[] args) {
        MyBean myBean = new MyBean();
        InvocationHandler handler = new MyInvocationHandler(myBean);

        MyService proxy = (MyService) Proxy.newProxyInstance(
                myBean.getClass().getClassLoader(),
                new Class[] {MyService.class},
                handler);

        proxy.doSomething();
    }
}
