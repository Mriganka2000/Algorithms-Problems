package com.algorithm.java;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        BinarySearchTree tree = new BinarySearchTree();

        tree.preOrder(tree.balanceBST(root));
    }

}