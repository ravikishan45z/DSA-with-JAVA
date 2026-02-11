import java.util.Scanner;
public class alphabet_traingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows  : ");
        int rows = sc.nextInt();
        for (int i = 65; i <= 65+rows; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

}
