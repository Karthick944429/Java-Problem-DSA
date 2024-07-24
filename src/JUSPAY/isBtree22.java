package JUSPAY;

public class isBtree22 {
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
        public static Node buildTree1(int node[]){
            idx++;
            if (node[idx]== -1){
                return null;
            }
            Node nn=new Node(node[idx]);
            nn.left= buildTree1(node);
            nn.right= buildTree1(node);
            return nn;
        }
    }
    public static boolean check(Node node, Long minValue, Long maxValue) {
        if (node == null) {
            return true;
        }
        if (node.data <= minValue ||  node.data >= maxValue) {
            return false;
        }
        return check(node.left, minValue, (long)node.data) && check(node.right,(long) node.data, maxValue);
    }
    public static void main(String[] args) {
        int[] bt1 ={1, 2, 3, -1, -1, 4, -1, -1, 5, 6, -1, -1, -1};
        int[] bt2 = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] BST ={4, 2, 6, 1, 3, 5, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree1(BST);
        boolean ans =check(root, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(ans);
    }
}
