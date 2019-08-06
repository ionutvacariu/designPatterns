package application.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Distributing items when a person cannot take more than two items of same type
 * <p>
 * https://www.geeksforgeeks.org/distributing-items-person-cannot-take-two-items-type/
 */
public class DistributingElementsToPersons {


    // Function to check hash array
    // corresponding to the given array
    static boolean checkCount(int arr[], int n, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();


        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.containsKey(arr[i]) ? hash.get(arr[i]) + 1 : 1);
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() > 2 * k)
                return false;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args) {

        int arr[] = {2, 3, 3, 5, 3, 3};
        int n = arr.length;
        int k = 2;
        if (checkCount(arr, n, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
