package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        Node root = new Node("+");
        root.left = new Node("*");
        root.right = new Node("/");
        root.left.left = new Node("-");
        root.left.right = new Node("5");
        root.right.left = new Node("21");
        root.right.right = new Node("7");
        root.left.left.left = new Node("10");
        root.left.left.right = new Node("5");
        System.out.println("The value of the expression is :- " + s.solve(root));
    }
}
