package com.Releationship;

public class Tree {
    public Node root;
    public int max_level = 0;

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void leftView() {
        int level = 1;
        leftView(root, level);
    }

    public void leftView(Node root, int level) {
        if (root == null) {
            return;
        }
        if (max_level < level) {
            System.out.println(root.data);
            max_level = level;
        }
        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }
}
