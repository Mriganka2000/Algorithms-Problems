import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);

        BinaryTree tree = new BinaryTree();
        ArrayList<Integer> list = tree.KDistanceNodes(root, 2, 1);

        System.out.println(list);
    }
}