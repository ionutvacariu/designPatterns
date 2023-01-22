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


        Integer hi = myList.stream().filter(i -> {
            System.out.println("hi");
            return true;
        }).findFirst().orElse(2);


        myList.parallelStream().forEach(System.out::println);

        Stream<Integer> integerStream = myList.stream().map(integer -> integer * 2);

        integerStream.forEach(System.out::println);
        List<Integer> res = myList.stream().map(integer -> integer * 2).toList();

        res.forEach(System.out::println);


        myList.forEach(ForEachExample::accept);

        myList.forEach(System.out::println);

    }

    private static void accept(Integer integer) {
        integer = integer + 123;
        System.out.println(integer);
    }
}
