public class sum_of_digit {

    public static void main(String[] args) {
        int sum = 0;
        int rem;
        int x = 7595;
        while (x != 0) {

            rem = x % 10; // get last digit
            sum = sum + rem;
            x = x / 10; 

        }
        System.out.println(sum);
    }
}
