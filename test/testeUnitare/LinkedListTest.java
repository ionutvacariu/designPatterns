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

        for (int i = 0; i < 30; i++) {
            linkedList.add(i);
        }
        linkedList.add(33);

        System.out.println(linkedList);
        assertEquals(12, linkedList.getHead().getValue());
        assertEquals(33, linkedList.getLast().getValue());


        linkedList.remove(4);
        linkedList.remove(5);
        linkedList.remove(12);
        linkedList.remove(25);

        linkedList.remove(33);
        System.out.println(linkedList);
    }
}
