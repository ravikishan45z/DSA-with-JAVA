package Pattern_printing;

import java.util.Scanner;

public class rectangle_pattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter no of Columns :");
        int m = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}