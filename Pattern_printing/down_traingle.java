package Pattern_printing;

import java.util.Scanner;

public class down_traingle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
               if((i+j)<=n+1){
                System.out.print(j+" ");
               }
               else{
                System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
