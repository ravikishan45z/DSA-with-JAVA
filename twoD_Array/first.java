package twoD_Array;

public class first {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0 ;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
