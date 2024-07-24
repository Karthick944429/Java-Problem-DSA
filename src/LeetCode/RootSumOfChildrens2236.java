package LeetCode;

public class RootSumOfChildrens2236 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.val =data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static TreeNode buildTree(int[] node) {
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }
            TreeNode nn = new TreeNode(node[idx]);
            nn.left = buildTree(node);
            nn.right = buildTree(node);
            return nn;
        }
    }
    public static boolean check(TreeNode root, int rt, boolean flag) {
        if (root == null) {
            return flag;
        }
        if (root != null) {
            if (root.left != null && root.right != null) {
                if ((root.left.val + root.right.val) == rt) {
                    flag = true;
                }
            }
        }
        check(root.left, rt, flag);
        check(root.right, rt, flag);
        return flag;
    }
    public static boolean rootDataIsEqualsToSumOfChildData(TreeNode root) {
        int rt = root.val;
        boolean flag =false;
        boolean ans =check(root,rt,flag);
        return ans;
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(node);
        boolean ans = rootDataIsEqualsToSumOfChildData(root);
        System.out.println(ans);
    }
}
