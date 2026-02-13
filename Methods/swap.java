public class swap {
    public static void main(String[] args) {
        //calling of the function.
        swap1(10, 20);
    }

    //declaration of the function.
    public static void swap1(int x, int y) {
        //using math.
        // x = x + y;
        // y = x - y;
        // x = x - y;

        // using temp variable.
        int temp = x;
        x = y;
        y = temp;

        //printing the values of x and y.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
