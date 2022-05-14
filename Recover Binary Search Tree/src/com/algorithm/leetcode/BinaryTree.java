package com.algorithm.leetcode;

public class BinaryTree {

    private TreeNode fast = null;
    private TreeNode second = null;

    private TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = fast.val;
        fast.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (fast == null && prev.val > root.val) {
            fast = prev;
        }
        if (fast != null && prev.val > root.val) {
            second = root;
        }

        prev = root;

        inorder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
