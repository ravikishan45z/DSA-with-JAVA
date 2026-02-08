import java.util.Scanner;

public class magnatitude {
    // take a integer and check it's magnatitude is smaller than 69 or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();
         
        if( no < 0 ){
        no = -no;
        }
        // System.out.println(no);
        if(no < 69){
            System.out.println("No is smaller than input no.");
        }
        else{
            System.out.println("No is not smaller than input no.");
        }
    }
}