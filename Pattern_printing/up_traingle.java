package Pattern_printing;

import java.util.Scanner;

public class up_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print((char) (64 + i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}