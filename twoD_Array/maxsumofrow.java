package twoD_Array;

public class maxsumofrow {
    public static void main(String[] args) {
        int[][] arr = {{10,17673,3},{42,4512,542},{721,238,4788}};
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum+= arr[i][j];
            }
            maxSum = Math.max(maxSum, sum);
            
            System.out.println();
        }

        System.out.println(maxSum);
    }
}
