public class BinaryTree {

    private boolean IsFoldableUtil(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return IsFoldableUtil(left.left, right.right) && IsFoldableUtil(left.right, right.left);
    }

    public boolean IsFoldable(Node root) {
        if (root == null) {
            return true;
        }

        return IsFoldableUtil(root.left, root.right);
    }
}
