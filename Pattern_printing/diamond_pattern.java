import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp--;
            nst = nst + 2;
            System.out.println();

        }
        nsp = 1;
        nst = (2 * n) - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp++;
            nst = nst - 2;
            System.out.println();
        }
    }
}