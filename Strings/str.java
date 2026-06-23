package Strings;
public class str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ravikishan");
        // StringBuilder s = new StringBuilder();
        // sb.append(" Gaur"); // used to add string at last position.
        // System.out.println(sb);
        // System.out.println(sb.length()+" "+sb.capacity());
        // //capacity() is used to view the capacity of the string if it fulls it automitically double it's capacity.

        // sb.setCharAt(0, 'b');
        // System.out.println(sb);
        // System.out.println(s.isEmpty());

        // String t = sb.toString(); // used to convert into a String.
        // System.out.println(t);
        // sb.delete(0, 5); // used to delete the string from index 0 to 5.
        System.out.println(sb.charAt(2));

        System.out.println(processStr("abcd%jh*", 3));
    }
    
    public char processStr(String s, long k) {
        StringBuilder ans = new StringBuilder("");
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '#') {
                ans.append(ans);
            } else if (s.charAt(i) == '%') {
                ans.reverse();
            } else if (s.charAt(i) == '*') {
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        char res = ans.charAt(k);
        if (k < ans.length()) {
            return (char) ('.');
        }
        return res;
    }
}
