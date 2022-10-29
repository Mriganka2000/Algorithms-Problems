public class Main {

    public static void main(String[] args) {
        Node root=new Node(26);
        root.left=new Node(10);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(6);
        root.right.right=new Node(3);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.isSumTree(root));
    }
}