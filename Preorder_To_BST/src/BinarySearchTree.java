public class BinarySearchTree {

    private Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        else if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public Node postOrder(int[] pre, int size) {
        Node root = null;

        for (int item : pre) {
            root = insert(root, item);
        }

        return root;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
