package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);

        Node result = tree.lca(tree.root, 3, 4);
        System.out.println(result.data);
    }
}
