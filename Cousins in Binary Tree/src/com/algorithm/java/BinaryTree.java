package com.algorithm.java;

public class BinaryTree {

    private boolean isSibling(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        return (
                (root.left != null && root.right != null && root.left.val == x && root.right.val == y) ||
                        (root.left != null && root.right != null && root.left.val == y && root.right.val == x) ||
                        isSibling(root.left, x, y) || isSibling(root.right, x, y)
        );
    }

    private int levelOfNode(TreeNode root, int target, int level) {
        if (root == null) {
            return 0;
        }

        if (root.val == target) {
            return level;
        }

        int l = levelOfNode(root.left, target, level + 1);

        if (l != 0) {
            return l;
        }

        return levelOfNode(root.right, target, level + 1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        return (
                levelOfNode(root, x, 1) == levelOfNode(root, y, 1) && !isSibling(root, x, y)
        );
    }

}
