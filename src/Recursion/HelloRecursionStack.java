package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class HelloRecursionStack {
    public static Stack<Character > st= new Stack<>();
    public static void StackRecur(String str,int n){
        if(n==str.length()){
            return;
        }
        st.push(str.charAt(n));
        StackRecur(str,n+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int n= str.length()-1;
// multiple time print agum       for(int i=0;i<str.length();i++){
//            st.push(str.charAt(i));
//        }
        StackRecur(str,0);
        while (!st.isEmpty()){
//            System.out.println(st.peek());
            System.out.println(st.pop());
//            st.pop();
        }
    }
}
