import java.util.*;
public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();
        //array
        int[] arr = new int[size];
        int min = Integer.MAX_VALUE;
        System.out.print("Enter the elements of Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            //calculate minimum.
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Minimum value : "+min);

        sc.close();
    }
}