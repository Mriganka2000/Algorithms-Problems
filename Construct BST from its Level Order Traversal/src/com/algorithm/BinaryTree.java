package com.algorithm;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertUtil(root, data);
    }

    public Node insertUtil(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else if (root.data > data) {
            root.left = insertUtil(root.left, data);
        }
        else if (root.data < data) {
            root.right = insertUtil(root.right, data);
        }
        return root;
    }

    public void constructFromLevelOrder(final int[] arr) {
        for (int item : arr) {
            insert(item);
        }
    }

    public void inorder() {
        inorderUtil(root);
    }

    public void inorderUtil(Node root) {
        if (root != null) {
            inorderUtil(root.left);
            System.out.print(root.data + " ");
            inorderUtil(root.right);
        }
    }
}
