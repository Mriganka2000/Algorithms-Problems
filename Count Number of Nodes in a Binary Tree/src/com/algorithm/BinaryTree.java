package com.algorithm;

public class BinaryTree {

    private static int count = 0;

    public int countNodes(Node root) {
        countNodesUtil(root);
        return count;
    }

    private void countNodesUtil(Node root) {
        if (root == null) {
            return;
        }
        count++;
        countNodesUtil(root.left);
        countNodesUtil(root.right);
    }

}
