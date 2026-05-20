package twoD_ARRAYLIST;

import java.util.ArrayList;

public class _2DArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(112);
        a.add(104);
        a.add(359);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(19584);
        b.add(1982);
        b.add(1984);
        b.add(3989);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(15430);
        c.add(154312);
        c.add(154304);
        c.add(354359);

        //! Arraylist of Arraylist ------>
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println(arr);
        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
