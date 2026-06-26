package Merge_Sort;

public class Reverse_pair {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(reversePairs(new int[] { 1, 3, 2, 3, 1 }));
    }

    public static int reversePairs(int[] nums) {
        count = 0;
        mergesort(nums);

        return count;
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;

        if (n == 1)
            return; // base case.

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[k];
            k++;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[k];
            k++;
        }

        mergesort(a);
        mergesort(b);
        inversion(a, b);

        merge(a, b, arr);
    }

    public static void inversion(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if ((long) a[i] > (2 * (long) b[j])) {
                count = count + (a.length - i);
                j++;
            } else {
                i++;
            }
        }
    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            arr[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }
}