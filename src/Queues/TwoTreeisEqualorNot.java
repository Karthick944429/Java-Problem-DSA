package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TwoTreeisEqualorNot {
    static Queue<Integer> qu1 = new LinkedList<>();
    static Queue<Integer> qu2 = new LinkedList<>();
    static Stack<Integer> st1= new Stack<>();
    static Stack<Integer> st2= new Stack<>();
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        qu1.add(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void preOrder1(Node root2){
        if (root2==null){
            return;
        }
        qu2.add(root2.data);
        preOrder1(root2.left);
        preOrder1(root2.right);
    }

    public static boolean isEqual(){
        while (!qu1.isEmpty()){
            st1.push(qu1.remove());
        }
        while (!qu2.isEmpty()){
            st2.push(qu2.remove());
        }
        if (st1.size()==st2.size()){
            while (!st1.isEmpty() && !st2.isEmpty()){
                if (st1.peek()==st2.peek()){
                    st1.pop();
                    st2.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (st1.isEmpty()&& st2.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left =new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);

        Node root2 = new Node(1);
        root2.left= new Node(2);
        root2.right= new Node(5);
        root2.left.left =new Node(4);
        root2.left.right= new Node(5);
        root2.right.left= new Node(6);
//        root2.right.left.right= new Node(6);
        preOrder(root);
        preOrder1(root2);
        System.out.println(isEqual());
        System.out.println(st2);
        System.out.println(st1);
    }
}
