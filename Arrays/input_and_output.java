package Arrays;

import java.util.*;

public class input_and_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        // input an array.
        System.out.print("Enter Arrays element : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        // output in array.
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}
