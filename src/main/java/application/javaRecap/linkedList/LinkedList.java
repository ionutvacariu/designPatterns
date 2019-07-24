package application.javaRecap.linkedList;

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


        iterateListAndRemove(value, currentNode);
        return this;
    }

    public LinkedList re() {
        this.head = reverse(this.head);
        return this;
    }

    public static Node reverse(Node currentNode) {

        if (currentNode == null) {
            return currentNode;
        }

        // last node or only one node
        if (currentNode.next == null) {
            return currentNode;
        }

        Node newHeadNode = reverse(currentNode.next);

        // change references for middle chain
        currentNode.next.next = currentNode;
        currentNode.next = null;

        // send back new currentNode node in every recursion
        return newHeadNode;
    }


    public void reverse() {
        Node prev = null;
        Node next;
        Node current = this.head;
        while (current != null) {
            next = current.next; // foloseste "al 3lea pahar"
            current.next = prev; // pointeaza la prev elementul curent
            prev = current;      // retine elementul curent, care deja are prev setat
            current = next;      // hai sa trecem la urmatorul element
        }
        this.last = this.head;   // setam last-ul ca si head
        this.head = prev;        // trebuie setata head-ul
    }


    private void iterateListAndRemove(V value, Node currentNode) {
        Node previous = this.head;
        while (currentNode.next != null) {
            if (currentNode.value.equals(value)) {
                //found it
                previous.next = currentNode.next;
                return;
            } else {
                previous = previous.next;
                currentNode = currentNode.next;
            }
        }
        if (currentNode.value.equals(value)) {
            this.last = previous;
            this.last.next = null;
        }
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

    public static void printSinglyLinkedList(Node node,
                                             String sep) {
        while (node != null) {
            System.out.print(String.valueOf(node.value) + sep);
            node = node.next;
        }
    }
}
