package algo;


import java.util.HashMap;
import java.util.Map;

/**
 * Longest Increasing consecutive subsequence
 * https://www.geeksforgeeks.org/longest-increasing-consecutive-subsequence/
 * <p>
 * AND
 * * Longest subsequence such that difference between adjacents is specific length | Set 2
 * * https://www.geeksforgeeks.org/longest-subsequence-difference-adjacents-one-set-2/
 * *
 */
public class LISConsecutive {
    public static void main(String[] args) {
        int a[] = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};
        System.out.println(lisConsecutive(a));


        int arr[] = {10, 9, 4, 5, 4, 8, 12, 6};
        System.out.println(lisConsecutive(arr, 4));


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

    /**
     * Longest subsequence such that difference between adjacents is specific length | Set 2
     * https://www.geeksforgeeks.org/longest-subsequence-difference-adjacents-one-set-2/
     *
     * @param a
     * @param le
     * @return
     */

    public static int lisConsecutive(int[] a, int le) {

        Map<Integer, Integer> freq = new HashMap<>();

        freq.put(a[0], 1);
        for (int i = 1; i < a.length; i++) {
            int currentEl = a[i];
            //if map contain predecesor consecutive number, means we have a consecutive subseq, so update freq with it's lenght + 1
            int currentFreq = freq.containsKey(getPredecesorConscutive(currentEl, le)) ? freq.get(currentEl - le) + 1 : 1;
            freq.put(a[i], currentFreq);
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

    private static int getPredecesorConscutive(int i, int leng) {
        return i - leng;
    }
}
