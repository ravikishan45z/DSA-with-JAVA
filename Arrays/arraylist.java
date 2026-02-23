import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        //Arraylist in java.
        //fn--> get(),set(),add(),remove(),collections()
        //initilization of the array.
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        
        arr.set(3, 10);
        arr.add(45);
        arr.add(67);

        int n = arr.size();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}