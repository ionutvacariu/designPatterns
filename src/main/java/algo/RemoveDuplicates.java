package algo;

import java.util.*;

public class RemoveDuplicates {


    public static void main(String[] args) {
        ArrayList<Integer>
                list = new ArrayList<>(
                Arrays
                        .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5, 2, 2, 2, 4, 4, 4, 4, 4, 4, 1, 23));

        RemoveDuplicatesWithComparable dd = new RemoveDuplicatesWithComparable<Integer>();
        System.out.println(list);
        System.out.println("Remove with sorting");
        System.out.println(dd.removeDuplicates(list));

        System.out.println("To HashSet");
        System.out.println(new HashSet<>(list));

        System.out.println("Without sorting");
        System.out.println(new RemuveDuplicatesWithoutSort().removeDuplicates(list));

        System.out.println("Stream distinct");

    }

    static class RemoveDuplicatesWithComparable
            <T extends Comparable<T>> {

        public ArrayList<T> removeDuplicates(final ArrayList<T> duplicates) {
            ArrayList<T> returnedList = new ArrayList<>(duplicates);
            Collections.sort(returnedList);
            ListIterator<T> iterator = returnedList.listIterator();
            while (iterator.hasNext()) {
                T next = iterator.next();
                if (iterator.hasNext()) {
                    if (next.equals(iterator.next())) {
                        iterator.remove();
                    }
                    //go back from second next()
                    iterator.previous();
                }
            }
            return returnedList;
        }
    }

    static class RemuveDuplicatesWithoutSort<T> {

        public ArrayList<T> removeDuplicates(final ArrayList<T> initialList) {
            ArrayList<T> retList = new ArrayList<>();

            Iterator<T> iterator = initialList.iterator();
            while (iterator.hasNext()) {
                T next = iterator.next();
                boolean found = contains(retList, next);
                if (!found) {
                    retList.add(next);
                }
            }
            return retList;
        }

        private boolean contains(ArrayList<T> retList, T element) {
            boolean found = false;
            Iterator<T> retListIterator = retList.iterator();

            while (retListIterator.hasNext()) {
                T next1 = retListIterator.next();

                if (element.equals(next1)) {
                    found = true;
                    break;
                }
            }
            return found;
        }
    }
}
