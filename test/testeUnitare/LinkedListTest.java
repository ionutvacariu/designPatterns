package testeUnitare;

import application.tips.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testMyMap() {


        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(Integer.valueOf(12));
        linkedList.add(2);
        linkedList.add(33);

        assertEquals(12, linkedList.getHead().getValue());
        assertEquals(33, linkedList.getLast().getValue());

        java.util.LinkedList<Integer> ii = new java.util.LinkedList<>();
        ii.add(12);
        ii.add(2,33);


    }
}
