package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderMethod {

    static class Node1{
        int data;
        Node1 left;
        Node1 right;
        public Node1(int item){
            this.data=item;
            this.left=null;
            this.right=null;
        }
    }
    public static void levelOrder(Node1 root){
//        if (root!=null){
//            return;
//        }
        Queue<Node1> queue= new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node1 newNode=queue.poll();
            System.out.print(newNode.data+" ");
            if (newNode.left!=null){
                queue.add(newNode.left);
            }
            if (newNode.right!=null){
                queue.add(newNode.right);
            }
        }
//        levelOrder(root.left);
//        levelOrder(root.right);
    }
    public static void main(String[] args) {
        Node1 root=new Node1(1);
        root.left=new Node1(2);
        root.right=new Node1(3);
        root.left.left=new Node1(4);
        root.left.right=new Node1(5);
        root.right.left=new Node1(6);
        root.right.right=new Node1(7);

        levelOrder(root);
    }
}
