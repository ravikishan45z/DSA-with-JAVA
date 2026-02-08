public class pattern_error {

    public static void main(String[] args) {
        int a = 20;
        for (int i = 7; i >= 1; i--) {

            for (int j = i; j >=1 && j <= 4; j--) {
                System.out.print(a+" ");
                --a;
            }
            System.out.println();
        }
    }

}