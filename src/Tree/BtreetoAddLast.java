package Tree;

public class BtreetoAddLast {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right= null;
        }
    }
    public static int sum=0;
    public static int addLast(Node node){
        if (node==null){
            return sum;
        }
        if (node.left==null&&node.right==null){
            sum+=node.data;
            return sum;
        }
        addLast(node.left);
        addLast(node.right);
        return sum;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        int res= addLast(root);
        System.out.println(res);
    }
}
