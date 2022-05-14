package com.algorithm;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println(tree.maxPathSum(root));
    }
}
