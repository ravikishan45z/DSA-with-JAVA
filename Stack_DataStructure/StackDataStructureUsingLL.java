package Stack_DataStructure;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyStack {
    Node head;
    int size = 0;

    public int peek() throws Exception {
        if(head == null){
            throw new Exception("Stack is Underflow.");
        }
        return head.val;
    }

    public int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack is Underflow.");
        }

        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    public void push(int val){
        Node temp = new Node(val);
        if(temp == null){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    public int size(){
        return size;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackDataStructureUsingLL {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        st.pop(); // exception
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();

        System.out.println(st.peek());
        st.pop();
        st.display();
    }
}
