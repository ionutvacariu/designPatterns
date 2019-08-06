package application.algo;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainSubarryWithSpecificSum {

    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};

        System.out.println(haveSubarrayWithZeroAmount(arr));
    }

    private static boolean haveSubarrayWithZeroAmount(int[] a) {

        Set<Integer> sumUntilHere = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == 0 || sumUntilHere.contains(sum)) {
                return true;
            }

            sumUntilHere.add(sum);
        }

        return false;

    }

}
