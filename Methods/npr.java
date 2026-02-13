import java.util.*;
public class npr {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r :");
        int r = sc.nextInt();

        int npr = fact(n) / fact(n-r);
        System.out.print("nPr = " + npr);
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
