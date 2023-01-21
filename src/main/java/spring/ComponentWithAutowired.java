package spring;

import spring.annotation.MyCustomAutowired;
import spring.annotation.MySpecialComponent;

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
