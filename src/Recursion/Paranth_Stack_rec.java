package Recursion;

import java.util.Stack;

public class Paranth_Stack_rec {
    public static Stack<Character> stack = new Stack<>();
    public static void validParanthes(String str, int n){
        if (n==0){
            stack.push(str.charAt(n));
            return;
        }
        validParanthes(str,n-1);

    }

    public static void main(String[] args) {
        String s1 = "(([{}])()[])";
        int n=s1.length()-1;
        validParanthes(s1,n);
        System.out.println(stack);
    }
}
