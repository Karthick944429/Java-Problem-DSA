package Tree;

public class PostOrderMethod {
    static class Node1 {
        int data;
        Node1 left;
        Node1 right;

        public Node1(int item) {
            this.data = item;
            this.left = null;
            this.right = null;
        }
    }

    public static void postOrder(Node1 root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);
        postOrder(root);
    }
}