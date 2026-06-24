package Recursion;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        powerset("", s,0);
    }

    private static void powerset(String ans, String s, int i) {
        if(i == s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(i);
        powerset(ans+ch, s, i+1); // pick statement
        powerset(ans, s, i+1); // Skip Statement
    }
    
}
