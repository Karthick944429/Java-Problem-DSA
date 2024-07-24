package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseUptoKeyValue {
    static Queue<Integer> queue=new LinkedList<>();
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> result = new Stack<>();
    public static void reverseUptokey(int a,int key){
        for(int i=1;i<=a;i++){
            queue.add(i);
        }
        for (int i=1;i<=key;i++){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            result.push(stack.pop());
        }
        while (!queue.isEmpty()){
            result.push(queue.remove());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        reverseUptokey(n,k);
        System.out.println(result);
    }
}
