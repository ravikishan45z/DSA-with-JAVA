package Pattern_printing;

import java.util.Scanner;

public class odd_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();

        System.out.println("First Way : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2 * j - 1 + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Second Way : ");
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }
}
