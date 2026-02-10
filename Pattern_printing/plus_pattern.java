package Pattern_printing;

import java.util.Scanner;

public class plus_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter N(in odd) : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for( int j = 1; j<=n;j++ ){
                if((n/2)+1  == i || (n/2)+1  == j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
