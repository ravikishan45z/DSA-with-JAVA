public class passbyvalue_and_reference {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = "+ x);
        change(18);
        System.out.print("X = "+x);
    }
    public static void change(int x){
       System.out.println("after changing : "+x);
    }
}
