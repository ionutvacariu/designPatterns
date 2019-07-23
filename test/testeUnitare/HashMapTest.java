package testeUnitare;

import application.tips.hasmap.HashMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HashMapTest {
    @Test
    public void testMyMap() {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");
        myMap.put("Australia", "Sydney_updated");

        assertNotNull(myMap);
        assertEquals(4, myMap.getSize());
        assertEquals("Kathmandu", myMap.get("Nepal"));
        assertEquals("Sydney_updated", myMap.get("Australia"));
    }
}
