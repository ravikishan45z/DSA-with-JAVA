import java.util.Scanner;

public class reverse_number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int rem,rev=0;
        
        while(x!=0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println("Reverse of the Number : "+rev);

    }
}
