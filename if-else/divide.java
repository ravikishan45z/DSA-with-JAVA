import java.util.Scanner;

public class divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        
        if((num%3 == 0)&& (num%5 == 0)){
            System.out.println("Number is divisable by both 5 & 3.");
        }
        else if(num%5 == 0){
            System.out.println("Number is divisable by 5.");
        }
        else if( num%3 == 0){
            System.out.println("Number is divisable by 3.");
        }
        else{
            System.out.println("Number is not divisable by 5 and 3.");
        }
    }
}