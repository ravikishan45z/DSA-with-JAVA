import java.util.Scanner;

public class rotate_d_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        System.out.print("Enter d:");
        int d = sc.nextInt();
        int[] arr = new int[size];
        int start;
        int end;
        System.out.print("Enter array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, d - 1);
        reverse(arr, d, size - 1);
        reverse(arr, 0, size - 1);
        System.out.print("Final Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}