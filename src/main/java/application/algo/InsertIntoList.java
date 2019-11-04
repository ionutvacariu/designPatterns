package application.algo;

import java.util.ArrayList;
import java.util.List;

public class InsertIntoList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            System.out.println("Nr. " + list.get(i) + " apare de : " + count);
        }


    }
}
