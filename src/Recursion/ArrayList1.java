package Recursion;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        arr.get(3);
        arr.remove(0);
        arr.add(6);
        arr.contains(6);
        arr.set(3,19);
        arr.size();
        System.out.println(arr.size());
    }
}
