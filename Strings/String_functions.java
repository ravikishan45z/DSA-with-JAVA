package Strings;

public class String_functions {
    public static void main(String[] args) {
        
        // String s = "22342343";
        // Functions of Srings
        // 1.Convert into Int
        // int num = Integer.parseInt(s);
        // System.out.println(num+10);

        // 2.String to charactere array

        // String name = "RAVIKISHAN";
        // System.out.println(name);

        // char[] arr = name.toCharArray(); //     -->  this is Known as camel case / pascel case
        // for(char ch : arr){
        //     System.out.println(ch);
        // }

        // 3. Substring function

        String s = "RAVIkishan";
        System.out.println(s.substring(4)); //from index to last
        System.out.println(s.substring(4).toUpperCase()); //convert the subsring to Upper case

        System.out.println(s.substring(0,4));
        


    }
}
