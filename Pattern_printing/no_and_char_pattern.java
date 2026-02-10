package Pattern_printing;

import java.util.Scanner;

public class no_and_char_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // int a = 1;
            for (int j = 1; j <= i; j++) {
               if(i%2!=0){
                System.out.print(j+" ");
               }
               else{
                System.out.print((char)(64+j)+" ");
               }
            }
            System.out.println();
        }
    }
}