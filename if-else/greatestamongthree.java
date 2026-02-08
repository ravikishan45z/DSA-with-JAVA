import java.util.Scanner;

public class greatestamongthree {
    // greatest amon three number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int x = sc.nextInt();
        System.out.print("Enter no : ");
        int y = sc.nextInt();
        System.out.print("Enter no : ");
        int z = sc.nextInt();
        
        // if-else logic for checking which no is greatest.
        if (x > y && x > z ) {
            System.out.println(x + " (X) is Greatest");
        } else if (y > z && y > x) {
            System.out.println(y + "(Y) is Greatest");
        } else {
            System.out.print(z + " (Z) is Greatest");
        }
    }
}