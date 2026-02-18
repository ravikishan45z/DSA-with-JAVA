import java.util.*;

public class sum_of_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        System.out.print("Enter the array Elements:");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.print("Sum of Array : " + sum);
    }
}