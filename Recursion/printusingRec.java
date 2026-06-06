package Recursion;

public class printusingRec {

    public static void main(String[] args) {
        print(10);
    }

    public static void print(int n) {
        if (n == 0)
            return; //ending of the function
        System.out.println(n);
        print(n - 1); //recursion
    }

    //! when a function is end.
    // 1st - when iteration is hit
    // 2nd - using return;
}
