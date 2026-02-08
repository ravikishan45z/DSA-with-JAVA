import java.util.Scanner;

public class check_four_digit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();

        if(no>999 && no<10000){
            System.out.println("Given no is a 4 digit No.");
        }
        else{
            System.out.println("Given no is not a 4 digit no.");
        }
    }
}