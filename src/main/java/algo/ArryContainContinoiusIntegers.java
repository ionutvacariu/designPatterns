package algo;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Check if array contains contiguous integers with duplicates allowed
 * <p>
 * https://www.geeksforgeeks.org/check-array-contains-contiguous-integers-duplicates-allowed/
 */
public class ArryContainContinoiusIntegers {

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 6,
                4, 4, 6, 6, 8};
        int n = arr.length;

        if (areElementsContiguous(arr, n))
            System.out.println("Yes");

        else
            System.out.println("No");

    }

    private static boolean areElementsContiguous(int[] arr, int n) {
        Set<Integer> el = new HashSet<>();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            el.add(arr[i]);
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        Iterator<Integer> iterator = el.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next != min && !el.contains(next - 1)) {
                return false;
            }
        }
        return true;

    }

}
