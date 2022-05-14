package com.algorithm;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node arrayToBst(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node newNode = new Node(arr[mid]);

        newNode.left = arrayToBst(arr, start, mid - 1);
        newNode.right = arrayToBst(arr, mid + 1, end);

        return newNode;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
