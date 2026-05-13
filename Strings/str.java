package Strings;
public class str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ravikishan");
        StringBuilder s = new StringBuilder();
        sb.append(" Gaur"); // used to add string at last position.
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        //capacity() is used to view the capacity of the string if it fulls it automitically double it's capacity.

        sb.setCharAt(0, 'b');
        System.out.println(sb);
        System.out.println(s.isEmpty());

        String t = sb.toString(); // used to convert into a String.
        System.out.println(t);

    }
}
