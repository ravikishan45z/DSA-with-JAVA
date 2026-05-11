import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter the elements of the array : ");
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print("Max element : " + max);
        sc.close();
    }
}
