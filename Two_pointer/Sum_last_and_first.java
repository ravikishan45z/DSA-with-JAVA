package Two_pointer;

public class Sum_last_and_first {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 77, 8, 9, 10 };

        int l = 0, r = arr.length - 1;
        System.out.print("Sum : " + (arr[l] + arr[r]));
    }
}
