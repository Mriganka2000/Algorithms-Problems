public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(15);
        root.right = new Node(8);

        root.left.left = new Node(12);
        root.left.right = new Node(20);
        root.right.left = new Node(5);
        root.right.right = new Node(9);

        root.left.left.left = new Node(2);
        root.left.left.right = new Node(14);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(7);

        root.right.right.right = new Node(10);

        BinaryTree tree = new BinaryTree();

        System.out.println(tree.largestBst(root));
    }
}