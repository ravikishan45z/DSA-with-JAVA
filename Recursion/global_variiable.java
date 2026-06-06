package Recursion;

public class global_variiable {
    static int n = 1000;
    public static void main(String[] args) {
        int x = 145;
        n =200;
        fun();
        System.out.println(x);
        System.out.println(n);
    }
    public static void fun(){
        System.out.println("fun method is called.");
        System.out.println(n);
        n = 100432;
        System.out.println(n);
    }
}
