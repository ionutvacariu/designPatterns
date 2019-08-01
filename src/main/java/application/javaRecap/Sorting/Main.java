package application.javaRecap.Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person();
        p1.setNume("Nume");
        p1.setVarsta(22);

        Person p2 = new Person();
        p2.setVarsta(25);
        p2.setNume("Ionut");

        personList.add(p2);
        personList.add(p1);

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getVarsta() == o2.getVarsta()) return 0;
                return o1.getVarsta() < o2.getVarsta() ? -1 : 1;
            }
        };


        personList.sort(comparator);

        for (Person p :
                personList) {
            System.out.println(p.getNume());
        }

    }
}
