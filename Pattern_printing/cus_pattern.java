public class cus_pattern {
    public static void main(String[] args) {
        int n = 1234534;
        while(n != 0){
            int digit = n % 10;
            print(digit);
            n = n /10;
        }

    }

    private static void print(int n) {
        for(int i = 0; i<n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}
