public class BinaryTree {

    public Node deleteNode(Node root, int k) {
        if (root == null) {
            return null;
        }
        if (root.data == k) {
            return root.left;
        }
        else if (root.data > k) {
            return deleteNode(root.left, k);
        }
        else {
            root.right = deleteNode(root.right, k);
            return root;
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
