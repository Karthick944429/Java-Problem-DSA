package LeetCode;

class Node {
        int data;
        Node left;
        Node right;


        public  Node(int item) {
            this.data = item;
            left = null ;
            right =null;
        }
        public  int size_1 = 0;

        public static boolean check_tree(Node node, Node nodes)
        {
          if(node == null && nodes == null)
              return true;
          if(node == null || nodes == null)
              return  false;
          return (node.data == nodes.data) && check_tree(node.left,nodes.left) && check_tree(node.right,nodes.right);
        }

    }

public class tree_equal {
    public static void main(String[] args) {

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);

        Node nodes = new Node(1);
        nodes.left = new Node(5);
        nodes.right = new Node(3);


        boolean ans = Node.check_tree(node,nodes);
        System.out.println(ans);
    }
}
