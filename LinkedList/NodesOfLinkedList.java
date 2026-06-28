package LinkedList;

class Node {
    int val;
    Node next; // Default value : null

    Node(int val) {
        this.val = val;
    }
}

public class NodesOfLinkedList {
    public static void main(String[] args) {

        // Creating Nodes
        Node a = new Node(10); // head node(pointer).
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Linking all the Nodes.
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null; // not required.

        System.out.print(a);
    }
}
