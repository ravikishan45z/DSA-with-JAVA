import java.util.*;

public class ncr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r :");
        int r = sc.nextInt();

        int ncr = fact(n) / (fact(r) * fact(n - r));
        System.out.print("nCr = " + ncr);
    }

    public static int fact(int x) {
        int f = 1;
        while (x >= 1) {
            f = f * x;
            --x;
        }
        return f;
    }
}