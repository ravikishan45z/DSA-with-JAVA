package Pattern_printing;

import java.util.Scanner;

public class reverse_traingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows  : ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
