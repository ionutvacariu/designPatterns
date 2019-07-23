package testeUnitare;

import application.tips.linkedList.LinkedList;
import application.tips.linkedList.Node;
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
        linkedList = new LinkedList<>();
        for (int i = 1; i < 8; i++) {
            linkedList.add(i);
        }
        LinkedList re = linkedList.re();
        System.out.println(re);
        System.out.println(linkedList);
        //Node reverse = LinkedList.reverse(linkedList.getHead());

        //linkedList.printSinglyLinkedList(reverse," ");
        //System.out.println(linkedList);
    }
}
