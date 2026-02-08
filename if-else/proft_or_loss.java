import java.util.Scanner;

public class proft_or_loss {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();

        if( cp == sp ){
            System.out.println("No Profit and No Loss");
        }
        else if( cp > sp ){
            System.out.println(cp-sp+"Rs Make Loss");
        }
        else{
            System.out.println(sp-cp+"Rs Made Profit");
        }
    }
}