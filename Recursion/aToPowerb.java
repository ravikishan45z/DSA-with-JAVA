package Recursion;

import java.util.Scanner;

public class aToPowerb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter power : ");
        int b = sc.nextInt();
        System.out.println(a + " raised to power " + b +" is " + pow(a, b));
        sc.close();
    }
    // public static int pow(int a, int b){
        //! time complexy --> O(b)
    //     if(b == 0){
    //         return 1;
    //     }
    //    return a * pow(a, b-1);
    // }
    public static int pow(int a, int b){
        // ! time coplexity ==> O(2 log b)
        if(b == 0){
            return 1;
        }
        int ans = pow(a, b/2);
        if( b % 2 == 0){
            return ans * ans;
        }
        return a* ans* ans;
    }

}
