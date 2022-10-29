import java.util.HashSet;
import java.util.Set;

public class BinaryTree {

    private int count = 0;
    private Set<TreeNode> set;

//    public int minCameraCover(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        count = 0;
//        set = new HashSet<>();
//        set.add(null);
//        dfs(root, null);
//
//        return count;
//    }

    public int minCameraCover(TreeNode root) {
        return dfs(root) == 0 ? count + 1 : count;
    }

//    0 -> Node not covered
//    1 -> Node has been covered
//    2 -> Node has camera

    private int dfs(TreeNode node) {
        if (node == null) {
            return 1;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (left == 0 || right == 0) {
            count++;
            return 2;
        }
        else if (left == 2 || right == 2) {
            return 1;
        }
        else {
            return 0;
        }
    }

    private void dfs(TreeNode root, TreeNode parent) {
        if (root != null) {
            dfs(root.left, root);
            dfs(root.right, root);

            if (parent == null && ! set.contains(root) || !set.contains(root.left) || !set.contains(root.right)) {
                count++;
                set.add(root);
                set.add(parent);
                set.add(root.left);
                set.add(root.right);
            }
        }
    }

}
