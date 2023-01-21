package javaRecap.java18.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachExample {

    public static void main(String[] args) {

        //creating sample Collection
        List<Integer> myList = new ArrayList<>();


        for (int i = 0; i < 10; i++) myList.add(i);


     myList.stream().filter(i -> {
            System.out.println("hi");
            return true;
        }).findFirst();



        myList.parallelStream().forEach(i -> System.out.println(i));

        Stream<Integer> integerStream = myList.stream().map(integer -> integer * 2);

        integerStream.forEach(i -> System.out.println(i));
        List<Integer> res = myList.stream().map(integer -> integer * 2).collect(Collectors.toList());

        res.forEach(i  -> System.out.println(i));


        myList.forEach(ForEachExample::accept);

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }

    private static void accept(Integer integer) {
        integer = integer + 123;
        System.out.println(integer);
    }
}
