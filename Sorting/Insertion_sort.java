package Sorting;

import java.util.Scanner;

public class Insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Arrays Element :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // sorting........
        for (int i = 1; i < size; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        //printing....
        for (int ele : arr) {
            System.out.print(ele+" ");
        }

    }
}