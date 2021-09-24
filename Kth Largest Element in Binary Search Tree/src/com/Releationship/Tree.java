package com.Releationship;

public class Tree {

    private static int count = 0;

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void kthLargest(Node root, int k) {
        if (root == null || count >= k) {
            return;
        }
        this.kthLargest(root.right, k);
        count++;
        if (k == count) {
            System.out.println(root.data);
        }
        this.kthLargest(root.left, k);
    }

}
