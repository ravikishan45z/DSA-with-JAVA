package twoD_Array;

import java.util.*;

public class foreachinarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}