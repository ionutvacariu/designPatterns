package algo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortBySpecificOrder {
    static Map<Character, Integer> order = new HashMap<>();

    static {//! # $ % & * @ ^ ~
        order.put('!', 0);
        order.put('#', 1);
        order.put('$', 2);
        order.put('%', 3);
        order.put('&', 4);
        order.put('*', 5);
        order.put('@', 6);
        order.put('^', 7);
        order.put('˜', 8);
    }


    public static void main(String[] args) {
        Character[] characters = {'@', '%', '$', '#', '^'};
        Arrays.sort(characters, (o1, o2) -> {
            if (order.get(o1) == order.get(o2)) return 0;
            return order.get(o1) > order.get(o2) ? 1 : -1;
        });
        for (Character c : characters) {
            System.out.print(c + " ");
        }


    }
}
