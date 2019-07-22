package application.tips.linkedList;

public class LinkedList<V> {
    private Node head;

    private Node last;

    static class Node<V> {

        V value;
        Node next;

        public Node(V value) {
            this.value = value;
        }
    }

    java.util.LinkedList linkedList = new java.util.LinkedList();


    public LinkedList insert(LinkedList list, V value) {
        Node nodeToInsert = new Node(value);
        if (this.head == null) {
            head = last = nodeToInsert;
        } else {
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;

            }

        }
        return list;
    }


}
