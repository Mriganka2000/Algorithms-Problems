package com.Releationship;

public class Node {
    char val;
    Node left;
    Node right;

    public Node(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Node(char val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
