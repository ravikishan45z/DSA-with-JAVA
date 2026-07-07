package Stack_DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class BasicofStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("C");
        st.push("B");
        st.push("D");
        st.push("E");
        System.out.println(st.size());
        System.out.println(st); //Space : O(n)
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop(); // only remove

        System.out.println(st.pop()); // return topMost element and remove it.
        //! Print using arraylist

        ArrayList<String> arr = new ArrayList<>();
        while (st.size() != 0) {
            arr.add(st.pop());
        }
        System.out.println(arr);

        //! Using while loop.
        while (st.size() != 0) {
            System.out.print(st.pop() +" ");
        }
    }
}
