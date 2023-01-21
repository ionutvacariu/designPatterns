package algo;


//Initial Template for Java

import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    public Node(int d) {
        this.data = d;
    }
}

/**
 * Rotate a linked list with p positions
 */
public class RevertLinkedLis {

    static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            //Entering the data
            Node head = new Node(sc.nextInt());
            Node curr = head;

            //Entering the rest of the list
            for (int i = 0; i < n - 1; i++) {
                int d = sc.nextInt();
                curr.next = new Node(d);
                curr = curr.next;
            }

            Gfg obj = new Gfg();
            if (p < n) {
                display(obj.rotateP(head, p));
            } else System.out.println("something wrong in input");
        }
    }
}

class Gfg {
    Node rotateP(Node head, int p) {
        int i = 0;
        Node current = head;
        while (current != null && ++i < p) {
            current = current.next;
        }
        Node newHead = current.next;  //3
        Node newTail = current;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        newTail.next = null;
        return newHead;
    }
}