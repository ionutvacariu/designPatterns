package algo;


import java.util.HashMap;
import java.util.Map;

/**
 * Find Itinerary from a given list of tickets
 * https://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets/
 */
public class FindItinerary {
    public static void main(String[] args) {
        Map<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");
        //  Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,
        printResult(dataSet);
    }

    private static void printResult(Map<String, String> dataSet) {


        Map<String, String> map = reverseMap(dataSet);

        String start = findStart(map);


        while (dataSet.get(start) != null) {
            System.out.print(start + " -> " + dataSet.get(start) + ", ");
            start = dataSet.get(start);

        }
    }

    /**
     * reverse map to reduce complexity  ( from O(n*n)  to O(n) )
     *
     * @param dataSet
     * @return
     */

    private static Map<String, String> reverseMap(Map<String, String> dataSet) {
        Map<String, String> map = new HashMap<>();
        dataSet.keySet();

        for (Map.Entry<String, String> entry : dataSet.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        return map;
    }

    private static String findStart(Map<String, String> map) {
        String start = null;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!map.containsKey(entry.getValue())) {
                start = entry.getValue();
                break;
            }
        }
        return start;
    }
}
