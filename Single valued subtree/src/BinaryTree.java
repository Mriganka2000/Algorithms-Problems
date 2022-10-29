class Count {
    int count;

    public Count() {
        this.count = 0;
    }
}

public class BinaryTree {

    private boolean singleValuedUtil(Node root, Count ct) {
        if (root == null) {
            return true;
        }

        boolean left = singleValuedUtil(root.left, ct);
        boolean right = singleValuedUtil(root.right, ct);

        if (!left || !right) {
            return false;
        }

        if (root.left != null && root.data != root.left.data) {
            return false;
        }

        if (root.right != null && root.data != root.right.data) {
            return false;
        }

        ct.count++;

        return true;
    }

    public int singleValued(Node root) {
        Count ct = new Count();
        singleValuedUtil(root, ct);
        return ct.count;
    }

}