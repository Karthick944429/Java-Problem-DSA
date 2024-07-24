package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int node[]){
            idx++;
            if (node[idx] == -1 ){
                return null;
            }
            Node nn=new Node(node[idx]);
            nn.left=buildTree(node);
            nn.right=buildTree(node);
            return nn;
        }
    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void levelOrder(Node root){
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node newNode=queue.poll();
            System.out.print(newNode.data+" ");
            if (newNode.left!=null){
                queue.add(newNode.left);
            }
            if (newNode.right!=null){
                queue.add(newNode.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] node = {1, 2, 3, -1, -1, 4, -1, -1, 5, 6, -1, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        levelOrder(root);
    }
}
