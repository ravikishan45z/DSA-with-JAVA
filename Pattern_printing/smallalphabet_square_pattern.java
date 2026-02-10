package Pattern_printing;
import java.util.Scanner;
public class smallalphabet_square_pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int n = sc.nextInt();
        for(int i = 97;i<97+n;i++){
            for(int j = 97; j<97+n; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
