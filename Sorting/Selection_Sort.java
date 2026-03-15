package Sorting;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = { 1, 334, 54, 23, 5, 67, 9, 0, -2 };
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
