package Strings;

import java.util.Scanner;

// this program consider code of counting digits of an integer without loop(for/while)
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s = s + n;
        System.out.println("Length : " + s.length());
        sc.close();
    }
}
