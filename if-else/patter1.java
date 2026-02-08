import java.util.Scanner;

public class patter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0) || (i == (n-1) || j == (n-1))) {
                    System.out.print("* ");
                } else if (i == n / 2 && j == n / 2) {
                    System.out.print("BCA ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}