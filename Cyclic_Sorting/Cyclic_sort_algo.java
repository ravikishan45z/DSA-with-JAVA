package Cyclic_Sorting;

public class Cyclic_sort_algo {

    //! cyclic sort algorithm is used to sort the array of n elements which contains numbers from 0 to n-1.
    public static void main(String[] args) {

        int[] nums = { 2, 4, 3, 1, 0, 5, 7, 6, 9, 8 };

        cyclicsort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void cyclicsort(int[] arr) {

        int n = arr.length;
        int i = 0;

        while (i < n) {

            if (arr[i] == i) {
                i++;
            } else {
                int correct = arr[i];
                swap(arr, i, correct);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}