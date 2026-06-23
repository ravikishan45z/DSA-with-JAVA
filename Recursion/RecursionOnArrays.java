package Recursion;

public class RecursionOnArrays {

    public static void main(String[] args) {
        int[] arr = { 1, 53, 5, 2, 67, 17, 81, 825, 8248, 222, 272, 265 };

        // Ordered
        print(arr, 0);
        System.out.println();

        // Reversed
        Rprint(arr, 0);
        System.out.println();

        // Searching
        System.out.println(exist(arr, 825, 0));
    }

    // Print in Assending Order.
    public static void print(int[] arr, int i) {
        int n = arr.length;
        if (i == n) {
            return;
        }
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    // Print in Reverse order.
    public static void Rprint(int[] arr, int i) {
        int n = arr.length;
        if (i == n) {
            return;
        }
        Rprint(arr, i + 1);
        System.out.print(arr[i] + " ");
    }

    // LinerSearch Using Recursion.
    public static Boolean exist(int[] arr, int target, int i) {
        int n = arr.length;
        if (i == n) {
            return false;
        }
        if (arr[i] == target)
            return true;
        return exist(arr, target, i + 1);
    }
}