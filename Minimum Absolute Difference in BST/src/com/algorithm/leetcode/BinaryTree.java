package com.algorithm.leetcode;

public class BinaryTree {

    private TreeNode prev = null;
    private int res = Integer.MAX_VALUE;

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            dfs(root.left);
        }
        if (prev != null) {
            res = Math.min(res, Math.abs(prev.val - root.val));
        }
        prev = root;
        if (root.right != null) {
            dfs(root.right);
        }
    }

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }

}
