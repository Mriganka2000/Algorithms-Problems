public class Tree {

    public int ceil(Node root, int val) {
        if (root == null) {
            return -1;
        }

        if (root.data == val) {
            return root.data;
        }

        if (root.data < val) {
            return ceil(root.right, val);
        }

        int res = ceil(root.left, val);

        return (res >= val) ? res : root.data;
    }
}
