package algo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Check if a given array contains duplicate elements within k distance from each other
 **/
public class KDistanceDublicates {


    static boolean checkDuplicatesWithinK(int arr[], int k) {
        Map<Integer, Integer> kDistance = new HashMap<>();

        List<Integer> kDistFoundEl = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {


            Integer integer = kDistance.get(arr[i]);

            if (integer != null) {
                if (i == k + integer + 1) {
                    kDistFoundEl.add(arr[i]);
                }
            } else kDistance.put(arr[i], i);
        }

        if (kDistFoundEl.size() > 0) {
            for (Integer inn : kDistFoundEl)
                System.out.print(inn + "  ");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
