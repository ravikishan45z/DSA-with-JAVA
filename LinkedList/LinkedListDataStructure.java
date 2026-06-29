package LinkedList;

//! TIME COMPLEXITY;
// INSERTING AT HEAD = O(1)
// INSERTING AT K = O(1)
// INSERTING AT TAIL = O(N)
// DELETING = O(N)
// DISPLAAT = O(N)



class Linkedlist {
    Node head;
    Node tail;
    int size; // LENGTH OF THE List

    Linkedlist() { // DEFAULT CONSTRUCTOR.
        head = tail = null;
    }

    // FUNCTION TO INSERTE ELEMENT AT HEAD POINTER.
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // FUNCTION TO DELETE ELEMENT AT HEAD POINTER.
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    void insertAtK(int index, int val) {
        if (index < 0 || index > size) {
            System.out.print("Invalid index");
        }else if (index == 0) {
            insertAtHead(val);
        } else if (index == size) {
            insertAtTail(val);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    // FUNCTION TO INSERTE ELEMENTS AT TAIL POINTER.
    void insertAtTail(int val) {

        // ! IT'S ALSO WORK PROPERLY
        // ? Node temp = new Node(val);
        // ? if(tail == null){
        // ? head = tail = temp;
        // ? }else{
        // ? tail.next = temp;
        // ? tail = temp;
        // ? }
        // ? size++;

        // ! ANOTHER TECHNIQUE TO ADD.
        if (tail == null) {
            insertAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

    void deleteAtK(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i = 0; i<index -1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (index == size - 1) {
            tail = temp;
        }
        size--;
    }

    void display() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    Boolean exists(int val) {
        if (head == null) {
            return false;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    int getindex(int val) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.val == val) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        // ADDING ELEMENTS AT TAIL POINTER
        ll.insertAtTail(10);
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.insertAtTail(40);
        ll.insertAtTail(50);
        ll.display();

        // ADDING ELEMENT AT HEAD POINTER
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtHead(40);
        ll.insertAtHead(50);
        ll.display();

        // DELETING VALUES AT HEAD;
        ll.deleteAtHead();
        ll.display();

        System.out.println(ll.size);

        System.out.println(ll.exists(100));
        System.out.println(ll.getindex(100)); // 0-BASED INDEXING.
        ll.insertAtK(4, 15);
        ll.display();
    }
}
