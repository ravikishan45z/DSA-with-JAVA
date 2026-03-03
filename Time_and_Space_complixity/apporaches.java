package Time_and_Space_complixity;

public class apporaches {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 4 };
        // first apporache
        // O(n*n) ---> time complaxity
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
        
        // Second apporache
        // O(n) ---> time complaxity
        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (flag[ele] == true) {
                System.out.println(arr[i]);
            } else {
                flag[ele] = true;
            }
        }
        
        //third apporache
        //O(n)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int size = arr.length - 1; 
        int total_sum = (size * (size + 1)) / 2;
        int duplicate_element = sum - total_sum;
        System.out.println(duplicate_element);
    }
}
