package Doubly_Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size = 0;

    // Insert at Head
    public void insertAtHead(int val) {
        ListNode temp = new ListNode(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    // Insert at Tail
    public void insertAtTail(int val) {
        ListNode temp = new ListNode(val);

        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // Delete Head.
    public void deleteAtHead() {
        if (head == null) {
            System.out.print("LinkedList is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Delete Tail.
    public void deleteAtTail() {
        if (tail == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    
    // Insert At Index (0-based).
    public void insertAtK(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtHead(val);
            return;
        }

        if (index == size) {
            insertAtTail(val);
            return;
        }

        ListNode temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        ListNode newNode = new ListNode(val);

        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.next.prev = newNode;

        size++;
    }

    // Delete at Index(0-based)
    public void deleteAtk(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            deleteAtHead();
            return;
        }

        if (index == size-1) {
            deleteAtTail();
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        ListNode deleteNode = temp.next;
        temp.next = deleteNode.next;
        deleteNode.next.prev = temp;
        size--;
    }

    // Disply
    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display in Reverese Order
    public void displayRev() {
        if (tail == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        ListNode temp = tail;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Size
    public void size() {
        System.out.println(size);
    }

    public void search(int val){

    }

    public void get(int index){

    }

    public void update(int index, int val){

    }
    
    public void Reverese(){
        
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtTail(30);
        list.insertAtTail(20);
        list.insertAtTail(10);

        list.display();
        list.displayRev();
        list.size();

        list.display();
        list.deleteAtHead();
        list.display();

        list.deleteAtTail();
        list.display();

        list.deleteAtk(3);
        list.display();
    }
}
