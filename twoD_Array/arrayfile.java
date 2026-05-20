package twoD_Array;
import java.util.Scanner;

public class arrayfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for(int i = 0; i<3;i++){
            for(int j= 0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
                if(arr[i][j] > max){
                    max = arr[i][j];
                    idx = i;
                }
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(idx);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
            }
            System.out.println();
        }

        sc.close();
    }
}
