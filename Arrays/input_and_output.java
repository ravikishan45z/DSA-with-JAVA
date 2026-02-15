package Arrays;

import java.util.*;

public class input_and_output {
    public static void main(String[] args) {
        //input line
        Scanner sc = new Scanner(System.in);
        //initilization o array.
        int[] arr = { 1, 19, 23, 131, 144, 463, 645, 53, 656, 654645, 575, 4534, 6, 65, 6, 757 };

        //initilization through new keyword.
        // int[] arr = new int[10]; --> means arrar of size 10 
        
        // input an array.
        // System.out.print("Enter Arrays element : ");
        // for (int i = 0; i < 10; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // output in array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
