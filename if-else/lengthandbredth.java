import java.util.Scanner;
public class lengthandbredth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float bredth = sc.nextFloat();

        float area = length*bredth;
        float perimeter = 2 * (length + bredth);
        
        if(area > perimeter){
            System.out.println("Area is greater than it's Perimeter");
        }
        else{
            System.out.println("Perimeter is greater than it's Area");
        }
    }
}