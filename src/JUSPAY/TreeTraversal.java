package JUSPAY;

public class TreeTraversal {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data= data;
            left=null;
            right=null;
        }
    }
    static class Btre{
        int idx = -1;
        public TreeNode buildTree(int [] node){
            idx++;
            if (node[idx]== -1){
                return null;
            }
            TreeNode nn = new TreeNode(node[idx]);
            nn.left = buildTree(node);
            nn.right = buildTree(node);
            return nn;
        }
    }
    public static void inOrder(TreeNode root) {
        if (root == null ){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int[] node = {1,-1,2};
        Btre tree = new Btre();
        TreeNode root = tree.buildTree(node);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}

