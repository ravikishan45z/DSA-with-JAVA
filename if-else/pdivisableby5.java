import java.util.Scanner;

public class pdivisableby5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enete A Integer No : ");
        int num = sc.nextInt();

        if( num<0 ){
            System.out.println("Not an Positive Integer No.");
        }
        else if( num%5 == 0 ){
            System.out.println("No is divisable by 5");
        }
        else
        {
            System.out.println("NO is not divisale by 5");
        }

    }
}