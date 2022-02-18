package com.algorithm;

public class Tree {

    public Node root = null;

    public Node convertToBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.left = convertToBST(arr, start, mid - 1);
        node.right = convertToBST(arr, mid + 1, end);
        return node;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}
