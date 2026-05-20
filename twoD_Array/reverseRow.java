package twoD_Array;

public class reverseRow {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            int r = arr[0].length-1;
            while(l<=r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
