package Two_pointer;

public class Reverse_arr {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 663, 25, 63, 63, 22, 64, 24, 73 };
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
