package javaRecap.overridePrivateMethods;

public class Derived extends Base {
    public void fun() {
        System.out.println("Derived fun");
    }

    public static void main(String[] args) {
        Base obj = new Derived();
        // observam ca nu putem -- sa accesam fun din Base
//        obj.fun();

        //dar putem accesa fun din derived
        Derived objD = new Derived();
        objD.fun();

    }
}
