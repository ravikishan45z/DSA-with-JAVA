import java.util.Scanner;

public class gp_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms : ");
        int n = sc.nextInt();

        int a = 1, r = 2;
        
        // calculate gp series.
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a = a*r;
        }
    }
}