package Tree;

public class PreeOrderMethod {
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
    public static void preOrder(Node1 root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node1 root=new Node1(1);
        root.left=new Node1(2);
        root.right=new Node1(3);
        root.left.left=new Node1(4);
        root.left.right=new Node1(5);
        root.right.left=new Node1(6);
        root.right.right=new Node1(7);

        preOrder(root);
    }
}
