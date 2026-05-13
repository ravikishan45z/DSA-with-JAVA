package Strings;

public class reversesb {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ravi");
        System.out.println(s);
        //? s.reverse(); //==> used to reverse the string.
        // System.out.println(s);

        //! Reverse using two pointer
        int l = 0, r = s.length()-1;
        while(l<=r){
            char temp1 = s.charAt(l);
            char temp2 = s.charAt(r);
            s.setCharAt(l, temp2);
            s.setCharAt(r, temp1);
            l++;
            r--;
        }
        System.out.println(s);
    }
}
