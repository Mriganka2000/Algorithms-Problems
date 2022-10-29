public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);

        BinaryTree tree = new BinaryTree();
        tree.connect(root);
    }
}