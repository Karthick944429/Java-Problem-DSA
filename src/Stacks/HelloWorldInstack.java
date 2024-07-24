package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class HelloWorldInstack {
    public static Stack<Character > st= new Stack<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
