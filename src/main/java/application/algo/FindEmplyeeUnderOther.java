package application.algo;

import java.util.HashMap;
import java.util.Map;


/**
 * Find number of Employees Under every Employee
 * https://www.geeksforgeeks.org/find-number-of-employees-under-every-manager/
 */
public class FindEmplyeeUnderOther {

    public static void main(String[] args) {
        // employee < - > mng
        Map<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("C", "F");
        dataSet.put("F", "F");
        dataSet.put("B", "C");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("A", "C");
        subordinate(dataSet);

    }


    public static Map<String, Integer> subordinate(Map<String, String> mng) {
        Map<String, Integer> subordinateNumber = new HashMap<>();
        for (Map.Entry<String, String> entry : mng.entrySet()) {
            Integer subNumber = subordinateNumber.get(entry.getValue());
            if (subNumber != null) {
                if (mng.containsValue(entry.getKey())) {
                    subordinateNumber.put(entry.getValue(), subordinateNumber.get(entry.getValue()) + 1);
                } else
                    subordinateNumber.put(entry.getValue(), ++subNumber);
            } else {
                if (mng.containsValue(entry.getKey())) {
                    subordinateNumber.put(entry.getValue(), subordinateNumber.get(entry.getKey()) != null ? subordinateNumber.get(entry.getKey()) + 1 : 1);
                } else {
                    subordinateNumber.put(entry.getValue(), 1);
                }
            }
        }

        for (Map.Entry<String, Integer> val : subordinateNumber.entrySet()) {
            System.out.println(val.getKey() + "   " + val.getValue());
        }
        return subordinateNumber;
    }
}