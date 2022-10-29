public class Main {

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.left = new Node(5);
        root.left.right = new Node(5);
        root.right.right = new Node(5);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.singleValued(root));
    }
}