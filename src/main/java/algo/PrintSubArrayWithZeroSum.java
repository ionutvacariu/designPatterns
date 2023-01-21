package algo;


/**
 * Print all subarrays with 0 sum
 * <p>
 * https://www.geeksforgeeks.org/print-all-subarrays-with-0-sum/
 */
public class PrintSubArrayWithZeroSum {

/*
    public static void main(String args[]) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = arr.length;

        ArrayList<Pair<Integer, Integer>> out = findSubArrays(arr
        );


        if (out.size() == 0)
            System.out.println("No subarray exists");
        else
            print(out);
    }

    // Utility function to print all subarrays with sum 0
    static void print(ArrayList<Pair<Integer, Integer>> out) {
        for (int i = 0; i < out.size(); i++) {
            Pair<Integer, Integer> p = out.get(i);
            System.out.println("Subarray found from Index "
                    + p.getKey() + " to " + p.getValue());
        }
    }

    private static ArrayList<Pair<Integer, Integer>> findSubArrays(int[] arr) {
        int sum = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        ArrayList<Pair<Integer, Integer>> sub = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            if (freq.containsKey(sum)) {
                Pair<Integer, Integer> pair = new Pair<>(freq.get(sum), i);
                sub.add(pair);
            }
            freq.put(sum, i);

        }
        return sub;
    }*/
}
