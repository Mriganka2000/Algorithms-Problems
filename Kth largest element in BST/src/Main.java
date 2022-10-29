public class Main {

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.kthLargest(root, 3));
    }
}