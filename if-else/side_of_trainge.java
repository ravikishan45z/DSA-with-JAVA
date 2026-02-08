import java.util.Scanner;

public class side_of_trainge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int a = sc.nextInt();
        System.out.print("Enter no : ");
        int b = sc.nextInt();
        System.out.print("Enter no : ");
        int c = sc.nextInt();

        if((a+b) > c && (b+c) > a && (c+a) >b  ){
            System.out.println("Can be side of a Traingle");
        }
        else{
            System.out.println("Can't be side of a Traingle");
        }
    }
}