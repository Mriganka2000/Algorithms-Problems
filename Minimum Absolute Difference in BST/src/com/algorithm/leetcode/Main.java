package com.algorithm.leetcode;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);

        BinaryTree tree = new BinaryTree();
        tree.getMinimumDifference(root);
        System.out.println(tree.getMinimumDifference(root));
    }
}
