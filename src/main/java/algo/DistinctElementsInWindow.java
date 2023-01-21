package algo;

import java.util.HashSet;
import java.util.Set;

/**
 * Count distinct elements in every window of size k
 * <p>
 * https://www.geeksforgeeks.org/count-distinct-elements-in-every-window-of-size-k/
 */
public class DistinctElementsInWindow {


    public static void main(String[] args) {


        int arr[] = {1, 2, 1, 3, 4, 2, 3}, k = 4;


        countDistinct(arr, k);

    }

    private static void countDistinct(int[] arr, int k) {
        int length = arr.length - k;
        for (int i = 0; i <= length; i++) {
            Set<Integer> freq = new HashSet<>();
            for (int j = i; j < k; j++) {
                freq.add(arr[j]);

            }
            k++;
            System.out.println(freq.size());
        }

    }
}
