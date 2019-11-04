package application.javaRecap.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("asd");
        list.add("bbb");
        Stream<String> stream = list.stream();
        Set<StringBuilder> abc = stream.map(p -> new StringBuilder(p)).collect(Collectors.toSet());

        for (StringBuilder ab : abc) {
            System.out.println(ab);
        }



        String ss = "t m b b e 6 1 z 6 5 8 0 1 1 4 4 3";

        String[] split = ss.split("");
        Stream<String> stream1 = Arrays.stream(split);
        String replace = ss.replace(" ", "").toUpperCase();
        System.out.println(replace);


    }
}
