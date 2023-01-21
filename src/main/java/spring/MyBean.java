package spring;

import spring.annotation.MySpecialComponent;

@MySpecialComponent // Service/Component/Repository
class MyBean implements MyService {
    public void doSomething() {
        System.out.println("IACA AICI SE IMPLEMENTEAZA METODA");
    }
}