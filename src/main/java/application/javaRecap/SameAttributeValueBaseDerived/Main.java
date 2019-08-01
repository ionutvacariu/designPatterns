package application.javaRecap.SameAttributeValueBaseDerived;

public class Main {
    public static void main(String[] args) {
        Derived b = new Derived();

        System.out.println(b.i);

        Base bb = b;


        System.out.println(bb.i);
    }
}
