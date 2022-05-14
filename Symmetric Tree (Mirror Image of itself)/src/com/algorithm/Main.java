package com.algorithm;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        System.out.println(tree.isSymmetric(root, root));
    }
}
