package Stack_DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class StackRev {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);

        //! First technique
        while(st.size() != 0){
            st2.push(st.pop());
        }
        while (st2.size() != 0) {
            st3.push(st2.pop());
        }

        // Reverse Order
        while(st2.size() != 0){
            st.push(st3.pop());
        }
        System.out.println(st);

        //! Reverse
        //  using ArrayList;
        ArrayList<Integer> ans = new ArrayList<>();
        while (st.size() != 0) {
            ans.add(st.pop());
        }
        for(int i = ans.size()-1; i >= 0; i--){
            st.push(ans.get(i));
        }

        System.out.println(st);
        while (st.size() != 0) {
            System.out.println(st.pop());
        }

    }
    
}
