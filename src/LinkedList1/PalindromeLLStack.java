package LinkedList1;

import java.util.Stack;

public class PalindromeLLStack {
    static Stack<Integer> stack = new Stack<>();
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void dataPush(Node head){
        Node temp = head;
        while (temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
    }
    public static Boolean isPalindrome(Node head){
        Node temp = head;
        while (temp!=null){
            if (temp.data==stack.pop())
                temp=temp.next;
            else
                return false;
        }
        return true;
    }

    public static void PrintNode(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp =temp.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next=new Node(2);
        node.next.next= new Node(2);
        node.next.next.next=new Node(4);
        System.out.println("Before rev:");
        PrintNode(node);
        dataPush(node);
        System.out.println("After rev:");
        Boolean res = isPalindrome(node);
        PrintNode(node);
        System.out.println(res);

    }
}
