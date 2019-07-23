package application.tips.linkedList;

public class LinkedList<V> {
    private Node head;

    private Node last;


    public LinkedList add(V value) {
        Node nodeToInsert = new Node(value);
        if (this.head == null) {
            head = last = nodeToInsert;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            last = nodeToInsert;
            currentNode.next = last;
        }
        return this;
    }


    public LinkedList remove(V value) {

        Node currentNode = null;

        if (head == null) {
            return this;
        }

        //have only one element
        if (this.head.next == null) {
            if (this.head.value.equals(value)) {
                head = null;
                last = null;
                return this;
            }
        } else {
            if (this.head.value.equals(value)) {
                head = head.next;
                return this;
            }
            currentNode = head.next;
        }


        Node previous = this.head;
        while (currentNode.next != null) {
            if (currentNode.value.equals(value)) {
                //found it
                previous.next = currentNode.next;
                return this;
            } else {
                previous = previous.next;
                currentNode = currentNode.next;
            }
        }
        if (currentNode.value.equals(value)) {
            last = previous;
        }


        return this;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }


    @Override
    public String toString() {
        Node currentNode = head;
        StringBuilder sb = new StringBuilder();
        while (currentNode.next != null) {
            sb.append(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        sb.append(last.value + " ");
        return sb.toString();
    }
}
