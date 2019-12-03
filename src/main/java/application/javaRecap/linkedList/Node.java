package application.javaRecap.linkedList;

public class Node<V> {

    V value;
    Node next;

    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }


}
