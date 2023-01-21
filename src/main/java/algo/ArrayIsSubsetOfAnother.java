package algo;


import java.util.HashMap;
import java.util.Map;

public class ArrayIsSubsetOfAnother {

    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7,7};
        int arr2[] = {11, 3, 7, 1};

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println("arr2 is not a subset of arr1");
    }

    static boolean isSubset(int arr1[], int arr2[], int m,
                            int n) {


        HashMap<Integer, Integer> hashMap = createHashMap(arr1, m);
        HashMap<Integer, Integer> hashMap2 = createHashMap(arr2, n);


        for (Map.Entry<Integer, Integer> entry : hashMap2.entrySet())
            if (!hashMap.containsKey(entry.getKey()) || hashMap.get(entry.getKey()) != entry.getValue())
                return false;
        return true;
    }

    private static HashMap<Integer, Integer> createHashMap(int[] arr1, int n) {
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Integer integer = map1.get(arr1[i]);

            if (integer != null) {
                map1.put(arr1[i], ++integer);
            } else map1.put(arr1[i], 0);
        }

        return
                map1;
    }

}

