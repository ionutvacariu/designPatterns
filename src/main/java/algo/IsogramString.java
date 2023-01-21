package algo;

import java.util.HashMap;

public class IsogramString {

    static boolean isIsogram(String data) {


        char[] chars1 = data.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars1.length; i++) {

            if (map.get(chars1[i]) != null) {
                return false;
            }
            map.put(chars1[i], 0);
        }

        return true;
    }

}
