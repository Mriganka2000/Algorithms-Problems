public class BinaryTree {

    private int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return (sum(root.left) + root.data + sum(root.right));
    }

    public boolean isSumTree(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int left = sum(root.left);
        int right = sum(root.right);

        if (root.data == left + right && isSumTree(root.left) && isSumTree(root.right)) {
            return true;
        }

        return false;
    }

    public int isSumTreeUtil(Node root) {
        // base case: empty tree
        if (root == null) {
            return 0;
        }

        // special case: leaf node
        if (root.left == null && root.right == null) {
            return root.data;
        }

        int left = isSumTreeUtil(root.left);
        int right = isSumTreeUtil(root.right);

        // if the root's value is equal to the sum of all elements present in its
        // left and right subtree
        if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE &&
                root.data == left + right) {
            return 2 * root.data;
        }

        return Integer.MIN_VALUE;
    }
}
