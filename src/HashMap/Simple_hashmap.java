package HashMap;

import java.util.HashMap;

public class Simple_hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        //to add element
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        System.out.println(hm);
        hm.remove(2);
        System.out.println();
        System.out.println(hm);

    }
}
