package twoD_Array;

public class SnakePatternColumnWise {
    public static void main(String[] args) {
        // int[][] arr = new int[3][3];
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+" ");
            }
            // System.out.println();
        }
    }
}
