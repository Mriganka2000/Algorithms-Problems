package com.Releationship;

public class Tree {
    private int result = 0;

    public int longestConsecutive(Node root) {
        if (root == null) {
            return 0;
        }
        result = 0;
        longestConsecutiveRecursive(root);
        return result;
    }

    private int longestConsecutiveRecursive(Node root) {
        if (root == null) {
            return 0;
        }
        int left = longestConsecutiveRecursive(root.left);
        int right = longestConsecutiveRecursive(root.right);
        int max = 1;
        if (root.left == null || root.left.data == root.data + 1) {
            max = Math.max(max, left + 1);
        }
        if (root.right == null || root.right.data == root.data + 1) {
            max = Math.max(max, right + 1);
        }
        result = Math.max(result, max);
        return max;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
