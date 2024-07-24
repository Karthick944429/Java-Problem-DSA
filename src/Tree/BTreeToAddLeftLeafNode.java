package Tree;

public class BTreeToAddLeftLeafNode {
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
    public static int sum=0;
    public static int addleftLeaf(Node node){
        if (node==null){
            return 0;
        }
        if(node.left!=null){
            if (node.left.left==null && node.left.right==null){
                sum+=node.left.data;
            }
        }
        addleftLeaf(node.left);
        addleftLeaf(node.right);
        return sum;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left=new Node(9);
        root.right= new Node(20);
        root.right.left=new Node(15);
        root.right.right= new Node(7);
        root.right.right.left=new Node(10);
        int res = addleftLeaf(root);
        System.out.println(res);
    }
}
