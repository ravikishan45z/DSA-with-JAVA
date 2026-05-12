package Strings;

import java.util.Scanner;

public class allSubstring {
    public static void main(String[] args) {

        // This program contains the code of printing all the Substring.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        for(int i = 0; i<=s.length();i++){
            for(int j = i+1; j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
