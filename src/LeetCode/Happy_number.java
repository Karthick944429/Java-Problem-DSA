package LeetCode;

import java.util.ArrayList;

class number{
    ArrayList<Integer> arr = new ArrayList<>();

    public boolean happy_numbers(int num)
    {
        int sq=0,rev=0;
        if(num == 1)
            return true;

        while(num>=1)
        {
            rev = num %10;
            num = num/10;
            sq += rev*rev;
        }

        if(arr.contains(sq))
           return false;
        arr.add(sq);
        return happy_numbers(sq);

    }
}
public class Happy_number {
    public static void main(String[] args) {
        int num = 61;
        number numb = new number();
        boolean ans = numb.happy_numbers(num);
        System.out.println(ans);
    }
}
