package Tree;

public class BinarySearchTree {
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
    static class BSTree{
        public static Node bulidTree(int[] node,int st, int end ){
            if (st>end){
                return null;
            }
            int mid= (st+end)/2;
            Node nn=new Node(node[mid]);
            nn.left = bulidTree(node, st, mid-1);
            nn.right=bulidTree(node,mid+1,end);
            return nn;
        }
    }
    public static void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        BSTree tree = new BSTree();
        Node root =tree.bulidTree(arr,0, arr.length -1);
        System.out.println(root.data);
        inOrder(root);
    }
}
