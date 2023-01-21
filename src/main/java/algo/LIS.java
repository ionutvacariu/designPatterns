package algo;


import java.util.HashMap;
import java.util.Map;

/**
 * Longest Increasing Subsequence
 */
public class LIS {
    static int lis(int arr[], int n) {

        int[] betterTill = new int[n];

        for (int i = 0; i < n; i++) {
            betterTill[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && betterTill[i] < betterTill[j] + 1) {
                    betterTill[i] = betterTill[j] + 1;
                }
            }
        }
        int max = 1;

        for (int i = 0; i < n; i++) {
            if (max < betterTill[i]) max = betterTill[i];
        }

        return max;

    }

    static void findLIS(int A[], int n) {
        Map<Integer, Integer> hash = new HashMap<>();

        // Initialize result
        int LIS_size = 1;
        int LIS_index = 0;

        hash.put(A[0], 1);
        // iterate through array and find
        // end index of LIS and its Size
        for (int i = 1; i < n; i++) {
            hash.put(A[i], hash.get(A[i] - 1) == null ? 1 : hash.get(A[i] - 1) + 1);
            if (LIS_size < hash.get(A[i])) {
                LIS_size = hash.get(A[i]);
                LIS_index = A[i];
            }
        }

        // print LIS size
        System.out.println("LIS_size = " + LIS_size);

        // print LIS after setting start element
        System.out.print("LIS : ");
        int start = LIS_index - LIS_size + 1;
        while (start <= LIS_index) {
            System.out.print(start + " ");
            start++;
        }
    }

    static int lisWithHash(int arr[], int n) {
        Map<Integer, Integer> betterTillMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            betterTillMap.put(arr[i], 1);
        }


        for (Map.Entry<Integer, Integer> entry : betterTillMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return 1;

    }

    public static void main(String args[]) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        int A[] = {2, 5, 3, 7, 4, 8, 5, 13, 6};


        //System.out.println("Length of lis is " + lis(arr, n) + "\n");
        findLIS(A, A.length);

       //  lisWithHash(arr, arr.length);

    }


}
