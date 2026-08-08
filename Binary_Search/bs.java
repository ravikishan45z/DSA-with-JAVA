package Binary_Search;

public class bs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 9));

    }

    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] > target){
                hi = mid-1;
            } else if(arr[mid] < target){
                lo = mid + 1;
            } else{
                return mid;
            }
        }

        return -1;
    }
}
