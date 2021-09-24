package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(4);

        tree.inOrder(tree.root);

        System.out.println(tree.treePathsSum(tree.root));
    }
}
