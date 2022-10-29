public class Main {

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(10);
        root.right = new Node(22);

        int k = 3;
        BinaryTree tree = new BinaryTree();

        System.out.println(tree.sum(root, k));
    }
}