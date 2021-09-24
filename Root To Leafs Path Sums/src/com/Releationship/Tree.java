package com.Releationship;

public class Tree {
    Node root;

    public long treePathsSum(Node root) {
        return treePathsSum(root, 0L);
    }

    public long treePathsSum(Node root, long val) {
        if(root == null) {
            return 0;
        }

        val = (val * 10) + root.data;

        if(root.left == null && root.right == null) {
            return val;
        }

        return treePathsSum(root.left, val) + treePathsSum(root.right, val);
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
