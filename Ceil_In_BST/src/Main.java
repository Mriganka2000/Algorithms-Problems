public class Main {

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);

        Tree tree = new Tree();

        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + tree.ceil(root, i));
        }
    }
}