package com.algorithm;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertUtil(root, data);
    }

    private Node insertUtil(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else {
            if (root.data > data) {
                root.left = insertUtil(root.left, data);
            }
            else {
                root.right = insertUtil(root.right, data);
            }
        }
        return root;
    }

    public void inorder() {
        inorderUtil(root);
    }

    private void inorderUtil(Node root) {
        if (root != null) {
            inorderUtil(root.left);
            System.out.println(root.data);
            inorderUtil(root.right);
        }
    }

    public boolean checkIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        return root1 != null && root2 != null && checkIdentical(root1.left, root2.left) && checkIdentical(root1.right, root2.right);
    }
}
