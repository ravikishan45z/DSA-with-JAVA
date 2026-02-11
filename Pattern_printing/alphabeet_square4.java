import java.util.Scanner;
public class alphabeet_square4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int n = sc.nextInt();
        System.out.print("Enter rows and columns : ");
        int m = sc.nextInt();

        //////// asking this questions.
        for (int i = 0; i < n; i++) {
                char ch = (char)(i % 2 == 0 ? 'a' + i : 'B' + i - 1);

                for (int j = 0; j < m; j++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
        }
    }
}
