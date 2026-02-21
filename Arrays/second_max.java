import java.util.*;
public class second_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        
        System.out.print("Enter Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            //max element.
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        //second max
        for (int i = 0; i < size; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        
        System.out.println("Maximum : "+max);
        System.out.println("Second Mximum : "+smax);
    }
}
