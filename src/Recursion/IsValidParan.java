package Recursion;

import java.util.Stack;

public class IsValidParan {
    static Stack<Character> stack= new Stack<>();
    public static boolean isValid(String s) {
        trueOrfalse(s,0);
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void trueOrfalse(String s,int n){
        if(n==s.length()){
            return;
        }
        if(s.charAt(n)=='('||s.charAt(n)=='['||s.charAt(n)=='{'){
            stack.push(s.charAt(n));
        }
        else{
            if(stack.isEmpty()){
                return;
            }
            else{
                if((stack.peek()=='(' && s.charAt(n)==')')||(stack.peek()=='[' && s.charAt(n)==']')||(stack.peek()=='{' && s.charAt(n)=='}')){
                    stack.pop();
                }
            }
        }
        trueOrfalse(s,n+1);
    }
    public static void main(String[] args) {
        String s1 = "]";
        System.out.println(isValid(s1));

    }
}
