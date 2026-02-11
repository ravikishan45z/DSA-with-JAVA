import java.util.Scanner;

public class ploys_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int a = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
