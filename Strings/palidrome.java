package Strings;

public class palidrome {
    public static void main(String[] args) {
        String name = "MADAM";

        boolean result = true;
        int l = 0;
        int r = name.length() - 1;

        while(l < r)
        {
            if (name.charAt(l) == name.charAt(r)) {
                result = true;
                l++;
                r--;
            } else {
                result = false;
                break;
            }
        }
        
        if(result == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
