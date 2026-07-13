package QueuesInJAVA;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class QueueDS {
    int val;
    Node head;
    Node tail;
    int size = 0;

    public void add(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int remove() {
        if (head == null) {
            return -1;
        }

        int value = head.val;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return value;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueDataStructureImp {
    public static void main(String[] args) {
        QueueDS q = new QueueDS();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println( q.remove());
        q.display();
    }
}
