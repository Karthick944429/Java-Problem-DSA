package Tree;

import java.util.*;

public class ZIgZagLevelTravasal {
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
        static int index=0;
        public static Node buildTree(int node[]){
            idx++;
            if (index==node.length){
                return null;
            }
            index++;
            Node nn=new Node(node[idx]);
//            System.out.println(nn.data+ " ");
            nn.left=buildTree(node);
            nn.right=buildTree(node);
            return nn;
        }
    }
    public static List<List<Integer>> zigzagPat(Node root){
        boolean lefttoright=true;
        List<List<Integer>> ans=new ArrayList<>();
        if (root==null){
            return null;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();;
            List<Integer> level=new ArrayList<>();
            for (int i=0;i<size;i++){
                Node node=q.poll();
                level.add(node.data);
                if (node.left!=null){
                    q.add(node.left);
                }
                if (node.right!=null){
                    q.add(node.right);
                }
            }
            if (lefttoright){
                Collections.reverse(level);
            }
            ans.add(level);
            lefttoright=!lefttoright;
        }
        return ans;
    }
    public static void print(List<List<Integer>> res){
        for (List<Integer> row:res){
            for (int val:row){
                System.out.print(val+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] node = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        List<List<Integer>> result = zigzagPat(root);
        print(result);
    }
}
