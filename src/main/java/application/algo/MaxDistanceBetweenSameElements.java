package application.algo;

import java.util.HashMap;
import java.util.Map;

public class MaxDistanceBetweenSameElements {

    public static void main(String[] args) {
        Integer arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};

        Map<Integer, Integer> firstApp = new HashMap<>();
        Map<Integer, Integer> lasApp = new HashMap<>();

        for (int index = 0; index < arr.length; index++) {
            if (firstApp.get(arr[index]) == null) {
                firstApp.put(arr[index], index);
            } else {
                lasApp.put(arr[index], index);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : lasApp.entrySet()) {
            int currenDistance = entry.getValue() - firstApp.get(entry.getKey());
            if (max < currenDistance) {
                max = currenDistance;
            }
        }
        System.out.println(max);
    }
}
