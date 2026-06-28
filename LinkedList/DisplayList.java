package LinkedList;

public class DisplayList {

    //!Display using Recursion.
    private static void displayRec(Node head) {
        if( head == null){
            return;
        }
        System.out.print(head.val + " ");
        displayRec(head.next);
    }

    //! Reverse of linked list.
    private static void reverse(Node head){
        if( head == null){
            return;
        }
        reverse(head.next);
        System.out.print(head.val + " ");
    }

    public static void display(Node head){
        //! Basic if you know no of nodes
        // System.out.println(head.val);
        // System.out.println(head.next.val);
        // System.out.println(head.next.next.val);
        // System.out.println(head.next.next.next.val);
        // System.out.println(head.next.next.next.next.val);
        // System.out.println(head.next.next.next.next.next.val);

        //! using while loop.(direct)
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next; // very Important
        }

        //? (notdirect)
        Node temp = head;
        while(temp != null){
            System.out.print(temp+" ");
            temp = temp.next; //very Important
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        
        display(a); //Normal display
        displayRec(a); // display using recursion;
        System.out.println();
        reverse(a); //Reverse printing    }
    }
}
