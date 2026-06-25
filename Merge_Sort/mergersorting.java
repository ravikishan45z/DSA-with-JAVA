package Merge_Sort;

public class mergersorting {
    public static void main(String[] args) {
        int arr[] = {1,45,543,614,123,2,35,35,61,64,1346};
        mergesort(arr);

        // printing of Sorted Array.
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void mergesort(int[] arr){
        int n = arr.length;

        if(n == 1) return;
        // There are four steps for doing merge sort.
        // Step 1 : Create 2 new arrays of n / 2 size ans n - n/2 size.
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];

        // Step2 : copy element to new arrays;
        int index = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = arr[index];
            index++;
        }
        for(int i = 0; i < b.length; i++){
            b[i] = arr[index];
            index++;
        }

        // Step 3 : Magic of Recursion on MergeSort technique;
        mergesort(a);
        mergesort(b);

        // Step 4: Call the helper function;
        merge(a,b,arr);
    }
    private static void merge(int[] a, int[] b, int[] arr) {
        // Merge to sortef array to one array.
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                arr[k] = a[i];
                i++;
                k++;
            }else{
                arr[k] = b[j];
                k++;
                j++;
            }
        }

        // left element of Array "a";
        while(i<a.length){
            arr[k] = a[i];
            k++;
            i++;
        }

        // left element of Array "b";
        while(j<b.length){
            arr[k] = b[j];
            k++;
            j++;
        }
    }

}
