package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(6);
        root.left.left = new Node(7);
        root.right = new Node(3);
        root.right.left = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(5);

        Tree tree = new Tree();
//        tree.inOrder(root);
        System.out.println(tree.longestConsecutive(root));
    }
}
