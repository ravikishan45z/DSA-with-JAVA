import java.util.*;

public class multiply_and_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        input(arr, size);
        System.out.print("Arrays elements Before : ");
        print(arr, size);
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println();
        System.out.print("Arrays elements After : ");
        print(arr, size);
    }

    public static void input(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
