package com.algorithm.java;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();

        System.out.println(tree.isCousins(root, 5, 4));
    }
}