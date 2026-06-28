package LinkedList;

public class getUsingIndex {
    public static void main(String[] args) {
        Node a = new Node(120);
        Node b = new Node(456);
        Node c = new Node(55);
        Node d = new Node(556);
        Node e = new Node(459);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(get(a, 3)); // 0-based indexing.
    }

    private static int get(Node head, int index) {
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}