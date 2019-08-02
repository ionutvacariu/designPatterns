package application.algo;


import java.util.HashMap;
import java.util.Map;

/**
 * Longest Increasing consecutive subsequence
 * https://www.geeksforgeeks.org/longest-increasing-consecutive-subsequence/
 */
public class LISConsecutive {
    public static void main(String[] args) {
        int a[] = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};

        System.out.println(lisConsecutive(a));

    }

    public static int lisConsecutive(int[] a) {

        Map<Integer, Integer> freq = new HashMap<>();

        freq.put(a[0], 1);
        for (int i = 1; i < a.length; i++) {
            int currentEl = a[i];
            //if map contain predecesor consecutive number, means we have a consecutive subseq, so update freq with it's lenght + 1
            freq.put(a[i], freq.containsKey(getPredecesorConscutive(currentEl)) ? freq.get(currentEl - 1) + 1 : 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }

    private static int getPredecesorConscutive(int i) {
        return i - 1;
    }
}
