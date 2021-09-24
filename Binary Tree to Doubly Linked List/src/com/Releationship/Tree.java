package com.Releationship;

public class Tree {

    public Node root;
    public DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        }
        if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public Node bstToDLL(Node root) {
        bstToDLLUtil(root);
        return doublyLinkedList.head;
    }

    private void bstToDLLUtil(Node root) {
        if (root == null) {
            return;
        }
        bstToDLLUtil(root.left);
        doublyLinkedList.insert(root.data);
        bstToDLLUtil(root.right);
    }
}
