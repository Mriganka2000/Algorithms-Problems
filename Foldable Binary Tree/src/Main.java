public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* The constructed binary tree is
             1
           /   \
          2     3
           \    /
            4  5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(tree.IsFoldable(root));
    }
}