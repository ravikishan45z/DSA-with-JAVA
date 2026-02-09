import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter a number : ");
        int b = sc.nextInt();
        int result = 1;
        for(int i = 1; i<=b;i++){
            result*=a;
        }
        System.out.println(result);
    }
}
