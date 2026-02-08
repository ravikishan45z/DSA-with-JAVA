import java.util.Scanner;

class integer {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number : ");
       int n = sc.nextInt();
       if(n<0){
           System.out.println(-n);
       }
       else{
           System.out.println(n);
       }
    }
}