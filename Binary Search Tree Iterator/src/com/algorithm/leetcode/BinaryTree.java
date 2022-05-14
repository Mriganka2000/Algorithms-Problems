package com.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public TreeNode current;
    public Queue<Integer> queue;

    public BinaryTree(TreeNode root) {
        queue = new LinkedList<>();
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            queue.add(root.val);
            inorder(root.right);
        }
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return queue.peek() != null;
    }

}
