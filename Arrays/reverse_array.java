import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int start = 0;
        int end = size - 1;

        System.out.print("Enter array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
