package LinkedList1;

import java.util.Stack;

public class ReverseLLStack {
    static Stack<Integer> stack = new Stack<>();
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void dataStackPush(Node head){
        Node temp = head;
        while (temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
    }
    public static void reverse(Node head){
        Node temp = head;
        while (temp!=null){
            temp.data=stack.pop();
            temp=temp.next;
        }
    }

    public static void PrintNode(Node head){
        Node temp = head;
        while (temp!=null){

            System.out.print(temp.data+" ");
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
        System.out.println("\nAfter rev:");
        dataStackPush(node);
        reverse(node);
        PrintNode(node);
        System.out.println("\n"+stack);

    }
}
