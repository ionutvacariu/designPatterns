package javaRecap.java18;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class ThreadStratMain {

    public static void main(String[] args) {



        Function<String, String > functie = a -> a + "asda";


        String bai_gica = functie.apply("bai gica");

        System.out.println(bai_gica);


        functionalInterfaceExample();


        new Thread(() -> System.out.println("started a new thread with lambda")).start();
        //Runnable is a functional Interface
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("started a new thread");
            }
        }).start();
    }

    private static void functionalInterfaceExample() {
        FunctionalInterface functionalInterface = () -> System.out.println("Metoda Abstracta");

        functionalInterface.metodaAbstracta();


        Square sq = (a) -> a * a;
        int ab = 3;
        System.out.println(sq.square(ab));
        sq.sq();

        Callable<Square> squareCallable = () -> (Square) a -> a * a;
        int a = 5;
        try {
            System.out.println(squareCallable.call().square(a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
