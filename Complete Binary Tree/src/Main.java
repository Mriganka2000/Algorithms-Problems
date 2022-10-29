public class Main {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        BinaryTree tree = new BinaryTree();

        System.out.println(tree.isCompleteBT(root));
    }
}