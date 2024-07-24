package Recursion;

import Queues.TwoTreeisEqualorNot;

public class TreesAreEqual {
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
    public static boolean checkTree(Node root1,Node root2){
        if (root1==null&&root2==null)
            return true;
        if (root1==null||root2==null)
            return false;
        boolean ans= (root1.data == root2.data) && checkTree(root1.left,root2.left) && checkTree(root1.right,root2.right);
        return ans;
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
        root2.right= new Node(3);
        root2.left.left =new Node(4);
        root2.left.right= new Node(5);
        root2.right.left= new Node(6);

        System.out.println(checkTree(root,root2));
    }
}
