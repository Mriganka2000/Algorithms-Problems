package com.algorithm.leetcode;

public class Main {

    public static void main(String[] args) {
	    TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        BinaryTree tree = new BinaryTree();
//        tree.preOrder(root);
        tree.recoverTree(root);
        tree.preOrder(root);
    }
}
