package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int n = arr.length;
        boolean ans = BinarySearch(arr, 9, 0, n - 1);
        System.out.println(ans);
    }

    public static boolean BinarySearch(int[] arr, int target, int lo, int hi) {
        // Base Case
        if (lo > hi) {
            return false;
        }

        // Binary Searching..
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return BinarySearch(arr, target, lo, mid - 1);
        } else {
            return BinarySearch(arr, target, mid + 1, hi);
        }
    }
}
