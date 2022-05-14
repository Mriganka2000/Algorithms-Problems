package com.algorithm;

public class BinaryTree {
    private int maxPath = Integer.MIN_VALUE;

    public int maxPathSum(Node root) {
        getMaxPath(root);
        return maxPath;
    }

    private int getMaxPath(Node root) {
        if (root == null) {
            return 0;
        }

        int left = getMaxPath(root.left);
        int right = getMaxPath(root.right);

        int max = root.data;
        max = Math.max(max, left + root.data);
        max = Math.max(max, right + root.data);

        maxPath = Math.max(maxPath, max);
        maxPath = Math.max(maxPath, left + root.data + right);

        return max;
    }
}
