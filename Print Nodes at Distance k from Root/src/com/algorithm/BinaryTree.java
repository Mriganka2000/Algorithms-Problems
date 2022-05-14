package com.algorithm;

public class BinaryTree {
    public void printNodes(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
        }
        else {
            printNodes(root.left, k - 1);
            printNodes(root.right, k - 1);
        }
    }
}
