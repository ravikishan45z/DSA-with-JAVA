package Set_and_Maps;

import java.util.HashSet;
import java.util.TreeSet;

public class set_stl {

    public static void main(String[] args) {
        // Time Complexity :
        // insert O(1)
        // searching O(1)
        // deletaiton O(1)

        // Space complexity: O(n)

        HashSet<Integer> set = new HashSet<>(); //unordered set
        set.add(12); // add
        set.add(42);
        set.add(78);
        set.add(123);
        set.add(52);
        set.add(73);
        set.add(89);
        set.add(450);
        set.add(49);
        // set.add(12); does't contains duplicate elements.

        // System.out.println(set); //print
        // System.out.println(set.size()); // size
        // System.out.println(set.contains(49)); //serching
        // set.remove(49); //removal
        // System.out.println(set.contains(49)); //searching



        // // TreeSet<>()
        // // Time Complexity :
        // // insert O(log n)
        // // searching O(log n)
        // // deletaiton O(log n)

        // // Space complexity: O(n)

        // // TreeSet is implemented through Balanced Binary Search tree. 
        // TreeSet<Integer> tset = new TreeSet<>(); //ordered set 
        // tset.add(12); // add 
        // tset.add(42);
        // tset.add(78);
        // tset.add(123);
        // tset.add(52);
        // tset.add(73);
        // tset.add(89);
        // tset.add(450);
        // tset.add(49);
        // // set.add(12); does't contains duplicate elements.

        // System.out.println(tset); // print
        // System.out.println(tset.size()); // size
        // System.out.println(tset.contains(49)); // serching
        // tset.remove(49); // removal
        // System.out.println(tset.contains(49)); // searching


        // Itterating over Sets

        for(int ele : set){
            System.out.print(ele + " ");
        }

        //add double.

        
    }
}
