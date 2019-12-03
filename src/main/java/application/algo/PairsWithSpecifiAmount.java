package application.algo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairsWithSpecifiAmount {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 7;

        for (Map.Entry<Integer, Integer> entry : pairsWithAmount(arr, k).entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }


    }

    public static Map<Integer, Integer> pairsWithAmount(int[] ar, int k) {
        Map<Integer, Integer> returned = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        set.add(ar[0]);
        for (int i = 1; i < ar.length; i++) {
            if (set.contains(k - ar[i])) {
                returned.put(ar[i], k - ar[i]);
            } else set.add(ar[i]);
        }
        return returned;
    }
}
