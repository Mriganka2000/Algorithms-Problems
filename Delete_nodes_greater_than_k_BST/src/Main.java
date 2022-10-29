public class Main {

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.left = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(5);

        BinaryTree tree = new BinaryTree();
        Node res = tree.deleteNode(root, 10);

        tree.inOrder(res);
    }
}