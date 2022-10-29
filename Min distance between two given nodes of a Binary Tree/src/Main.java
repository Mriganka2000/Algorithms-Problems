public class Main {

    public static void main(String[] args) {
        /* Construct the following tree
              1
            /   \
           /     \
          2       3
           \     / \
            4   5   6
               /     \
              7       8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.right.right = new Node(8);
//        root.left = new Node(8);
//        root.right = new Node(22);
//        root.left.left = new Node(4);
//        root.left.right = new Node(12);
//        root.left.right.left = new Node(10);
//        root.left.right.right = new Node(14);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.findDistance(root, 7, 6));
        System.out.println(tree.findLCA(root, 7, 8).data);
    }
}