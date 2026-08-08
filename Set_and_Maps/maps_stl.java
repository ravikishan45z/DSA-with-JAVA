package Set_and_Maps;

import java.util.HashMap;


public class maps_stl {
    public static void main(String[] args) {
        HashMap<Character, Integer>map = new HashMap<>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',1);
        map.put('e',1);
        map.put('f',1);
        map.put('g',1);
        map.put('a', 10);

        map.remove('a');
        // System.out.println(map);

        // Itterating
        for(char a : map.keySet()){
            System.out.println(a);
        }
    }
}
