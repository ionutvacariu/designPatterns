package application.javaRecap.overridePrivateMethods;

public class Derived extends Base {
    public void fun() {
        System.out.println("Derived fun");
    }

    public static void main(String[] args) {
        Base obj = new Derived();
      // obj.fun();
    }
}
