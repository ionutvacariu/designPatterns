package javaRecap.countOccurrencesInArray;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrencesInArray {

    public static void main(String[] args) {
        List<Integer> integers = populateList();
        Map<Integer, Integer> occ = new HashMap<>();
        for (Integer intg : integers) {
            Integer integer = occ.get(intg);
            if (integer == null) {
                occ.put(intg, 1);
            } else {
                occ.put(intg, ++integer);
            }
        }
        System.out.println(integers);
        for (Map.Entry entry : occ.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

    }

    private static List<Integer> populateList() {
        List<Integer> linkedList = new ArrayList<>();

        linkedList.add(Integer.valueOf(12));
        linkedList.add(2);

        for (int i = 0; i < 30; i++) {
            linkedList.add(i);
        }
        linkedList.add(33);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);

        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(55);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);

        return linkedList;
    }
}
