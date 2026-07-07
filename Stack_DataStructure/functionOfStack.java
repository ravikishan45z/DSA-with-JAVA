package Stack_DataStructure;

import java.util.Stack;

public class functionOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // pushAtBottom(50, st);
        
        System.out.println(st);
        reverseRecursively(st);
        System.out.println(st);
    }

    private static void pushAtBottom(int data, Stack<Integer> st) {
        if (st.size() == 0) {
            st.push(data);
            return;
        }

        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);
    }

    private static void reverseRecursively(Stack<Integer> st) {
        if (st.size() <= 1) {
            return;
        }
        int top = st.pop();
        reverseRecursively(st);
        pushAtBottom(top, st);
    }
}
