package com.algorithm.java;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }

    private TreeNode generate(List<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = generate(list, left, mid - 1);
        root.right = generate(list, mid + 1, right);

        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return generate(list, 0, list.size() - 1);
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}
