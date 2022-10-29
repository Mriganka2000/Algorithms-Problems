public class BinaryTree {

    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        else if (root.data > key) {
            root.left = insert(root.left, key);
        }
        else if (root.data < key) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    public boolean hasPathSum(Node root, int sum) {
        if (root == null) {
            return false;
        }
        int subSum = sum - root.data;
        boolean ans = false;

        if (subSum == 0 && root.left == null && root.right == null) {
            return (ans = true);
        }
        if (root.left != null) {
            ans = ans || hasPathSum(root.left, subSum);
        }
        if (root.right != null) {
            ans = ans || hasPathSum(root.right, subSum);
        }

        return ans;
    }
}
