public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        BinaryTree tree = new BinaryTree();
        Node head = tree.bToDLL(root);
        tree.print(head);
    }
}