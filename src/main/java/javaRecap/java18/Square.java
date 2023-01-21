package javaRecap.java18;

@java.lang.FunctionalInterface
public interface Square {
    int square(int a);
    default void sq(){
        System.out.println("inside default method");
    };
}
