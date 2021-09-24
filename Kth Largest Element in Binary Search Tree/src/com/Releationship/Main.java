package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        Tree tree = new Tree();
        tree.inOrder(root);
        tree.kthLargest(root, 3);
    }
}
