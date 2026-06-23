package Recursion;

public class RecursionOnArrays {

    public static void main(String[] args) {
        int[] arr = {1,53,5,2,67,17,81,825,8248,222,272,265};
        print(arr,0);
    }
    public static void print(int[] arr, int i){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        print(arr, i+1);
    }
}