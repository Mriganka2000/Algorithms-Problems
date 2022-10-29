public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(6);
        root.right.right = new Node(5);
        root.left.left = new Node(8);
        root.left.right = new Node(4);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.nextRight(root, 2).data);
    }
}