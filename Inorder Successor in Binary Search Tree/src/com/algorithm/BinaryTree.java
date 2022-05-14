package com.algorithm;

public class BinaryTree {
    public Node insert(Node root, int data) {
        if (root == null) {
            return (new Node(data));
        }
        else {
            Node temp = null;
            if (root.data >= data) {
                temp = insert(root.left, data);
                root.left = temp;
            }
            else {
                temp = insert(root.right, data);
                root.right = temp;
            }
            temp.parent = root;
            return root;
        }
    }

    public Node inorderSuccessor(Node root, Node node) {
        if (node.right != null) {
            return minValue(node);
        }

        Node successor = null;
        while (root != null) {
            if (root.data > node.data) {
                successor = root;
                root = root.left;
            }
            else if (root.data < node.data) {
                root = root.right;
            }
            else {
                break;
            }
        }

        return successor;
    }

    public Node minValue(Node root) {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }
}
