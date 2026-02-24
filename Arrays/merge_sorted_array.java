public class merge_sorted_array {
    public static void main(String[] args) {
        int[] a = { 12, 223, 224, 248, 249, 370 };
        int[] b = { 123, 178, 180, 226, 256, 349, 356, 379 };
        int[] c = new int[a.length + b.length];

        merge(a, b, c);
        // print merged array once
        for (int ele : c) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        // merge elements until one array is exhausted
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        // copy remaining elements from a or b
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
