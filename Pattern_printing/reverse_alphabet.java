package Pattern_printing;

import java.util.Scanner;

public class reverse_alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N  : ");
        int n = sc.nextInt();
        int a = n;
        int i, j;
        for (i = 65; i < 65 + n; i++) {
            for (j = 65; j < 65 + a; j++) {
                System.out.print((char) j+" ");
            }
            a--;
            System.out.println();
        }
    }
}
