package com.algorithm.leetcode;

public class Main {

    public static void main(String[] args) {
	    int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        BinaryTree tree = new BinaryTree();

        TreeNode root = tree.buildTree(preorder, inorder);
        tree.inOrder(root);
    }
}
