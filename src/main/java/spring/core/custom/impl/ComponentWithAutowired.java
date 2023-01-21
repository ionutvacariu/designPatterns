package spring.core.custom.impl;

import spring.core.custom.impl.annotation.MyCustomAutowired;
import spring.core.custom.impl.annotation.MySpecialComponent;

@MySpecialComponent
public class ComponentWithAutowired {
    @MyCustomAutowired
    private MyService myBean;

    public void aiciApelamMyBean() {
        System.out.println("Apelam controller-ul");
        myBean.doSomething();
        System.out.println("Final apel controller");
    }


}
