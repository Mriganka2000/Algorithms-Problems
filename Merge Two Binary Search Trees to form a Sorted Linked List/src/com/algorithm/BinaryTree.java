package com.algorithm;

import java.util.List;

public class BinaryTree {
    public void inorder(TreeNode root, List<Integer> tree) {
        if (root != null) {
            inorder(root.left, tree);
            tree.add(root.data);
            inorder(root.right, tree);
        }
    }
}
