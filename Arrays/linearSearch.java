import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size]; 
        input(arr, size);
        
        System.out.print("Enter the Target Element :");
        int target = sc.nextInt();

        print(arr, size);
       
        int flag = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                flag = i;
                break;
            }
        }
        if (flag != -1)
            System.out.println("Element Exist in the array at index : "+ flag);
        else
            System.out.println("Element not exist");
    }

    public static void input(int[] arr,int size) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int[] arr, int size) {
        System.out.println("Array Elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
