package com.algorithm;

public class Tree {
    public boolean isSymmetric(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null && root1.data == root2.data) {
            return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
        }

        return false;
    }
}
