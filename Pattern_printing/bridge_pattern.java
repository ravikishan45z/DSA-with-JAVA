import java.util.Scanner;
public class bridge_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j == 1 || i + j <= n+1 || j - i > n-2) {
                    System.out.print("*" + " ");
                } 
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}