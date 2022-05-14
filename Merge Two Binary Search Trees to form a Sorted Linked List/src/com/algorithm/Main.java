package com.algorithm;

public class Main {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(100);
        root1.left = new TreeNode(50);
        root1.right = new TreeNode(300);
        root1.left.left = new TreeNode(20);
        root1.left.right = new TreeNode(70);

        TreeNode root2 = new TreeNode(80);
        root2.left = new TreeNode(40);
        root2.right = new TreeNode(120);

        Solution solve = new Solution();
        solve.mergeTrees(root1, root2);
    }
}
