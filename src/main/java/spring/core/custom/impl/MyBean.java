package spring.core.custom.impl;

import spring.core.custom.impl.annotation.MySpecialComponent;

@MySpecialComponent // Service/Component/Repository
class MyBean implements MyService {
    public void doSomething() {
        System.out.println("IACA AICI SE IMPLEMENTEAZA METODA");
    }
}