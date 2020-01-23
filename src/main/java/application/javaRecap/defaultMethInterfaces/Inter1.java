package application.javaRecap.defaultMethInterfaces;

public interface Inter1 {

     String s = "a";
    default void inter(){

        System.out.println("blea sunt in inter1");
    }
}
