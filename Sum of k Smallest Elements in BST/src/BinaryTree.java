public class BinaryTree {

    private int ans = 0;

    private void calculateSum(Node root, int k) {
        if (root.left != null) {
            calculateSum(root.left, k);
        }

        if (k > 0) {
            ans += root.data;
            k--;
        }
        else {
            return;
        }

        if (root.right != null) {
            calculateSum(root.right, k);
        }
    }
    public int sum(Node root, int k) {
        calculateSum(root, k);
        return ans;
    }
}
