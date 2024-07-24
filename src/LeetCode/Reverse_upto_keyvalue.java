package LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_upto_keyvalue {
    public static Queue<Integer> q= new LinkedList<>();
    public static Stack<Integer> st= new Stack<>();
    public static Queue<Integer> ans = new LinkedList<>();
    public static void reverse(Queue<Integer> qu,int key)
    {
        while(key != qu.peek()) {
            st.push(qu.peek());
            q.remove();
        }
        st.push(qu.peek());
        q.remove();
        while(!st.isEmpty())
            ans.add(st.pop());
        while(!q.isEmpty())
            ans.add(q.remove());
    }
    public static void main(String[] args)
    {

        for(int i = 1;i<=10;i++)
            q.add(i);
        reverse(q,3);
        System.out.println(ans);
    }
}
