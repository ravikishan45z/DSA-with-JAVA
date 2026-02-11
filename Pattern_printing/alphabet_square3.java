import java.util.Scanner;

public class alphabet_square3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter Columns : ");
        int m = sc.nextInt();
        for (int i = 65; i < 65 + n; i++) {
            for (int j = 65; j < 65 + m; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}