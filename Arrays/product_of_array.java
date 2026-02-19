import java.util.*;
public class product_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            product = product * arr[i];
        }
        System.out.println("Product of the Array :" + product);
    }
}
