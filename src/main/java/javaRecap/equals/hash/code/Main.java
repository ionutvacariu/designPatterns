package javaRecap.equals.hash.code;


import java.util.*;

public class Main {

    //Iterator -> pe lista
    //Hash Map ->  hashCode -> hashCode colision
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ionel");
        p.setAge(12);
        Person p2 = new Person();
        p2.setAge(12);
        p2.setName("Costica");

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p.equals(p2));


        Map<Person, Integer> map = new HashMap<>();

        map.put(p, 22);
        map.put(p2, 33);

        Iterator<Map.Entry<Person, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, Integer> next = iterator.next();

            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

        List<Person>
                list = new ArrayList<>();
        list.add(p);
        list.add(p2);

        //Iterators
        Iterator<Person> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
