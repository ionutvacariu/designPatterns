package application.algo;

import java.util.LinkedList;
import java.util.ListIterator;

public class PairsFromLinkedListWithSum {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            list.add(i);


        }

        System.out.println(countPairs(list, list, 10));

    }

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // add your code here


        int numberOfPairs = getNumberOfPairsInLinkedList(head1, x);
        numberOfPairs += getNumberOfPairsInLinkedList(head2, x);


        numberOfPairs += getNumberOfPairsFromTwoLists(head1, head2, x);


        return numberOfPairs;
    }

    private static int getNumberOfPairsFromTwoLists(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {

        int numberOfPairs = 0;

        ListIterator<Integer> listIterator1 = head1.listIterator();
        while (listIterator1.hasNext()) {
            Integer next = listIterator1.next();

            ListIterator<Integer> listIterator2 = head2.listIterator();
            while (listIterator2.hasNext()) {
                if (next + listIterator2.next() == x) {
                    numberOfPairs++;
                }
            }
        }
        return numberOfPairs;
    }

    private static int getNumberOfPairsInLinkedList(LinkedList<Integer> head1, int x) {
        int numberOfPairs = 0;

        ListIterator<Integer> integerListIterator = head1.listIterator();
        while (integerListIterator != null && integerListIterator.hasNext()) {
            Integer next = integerListIterator.next();
            if (next * 2 == x) {
                numberOfPairs++;
            }
            ListIterator<Integer> integerListIterator2 = head1.listIterator(integerListIterator.nextIndex());
            while (integerListIterator2.hasNext()) {
                if (next + integerListIterator2.next() == x) {
                    numberOfPairs++;
                }
            }
        }
        return numberOfPairs;
    }
}
