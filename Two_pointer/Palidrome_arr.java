package Two_pointer;

import java.util.Scanner;

public class Palidrome_arr {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int l = 0, r = arr.length - 1;
        boolean op = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Arr Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while (l < r) {
            if (arr[l] != arr[r]) {
                op = false;
                break;
            } else {
                l++;
                r--;
            }
        }

        if (op == true) {
            System.out.println("Palidrome Array.");
        } else {
            System.out.println("Not Palidrome Array.");
        }

    sc.close();
    }
}
