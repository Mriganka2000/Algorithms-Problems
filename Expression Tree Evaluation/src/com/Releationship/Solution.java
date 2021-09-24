package com.Releationship;

public class Solution {
    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private double evaluate(String op, double x, double y) {
        if (op == "+") {
            return x + y;
        }
        if (op == "-") {
            return x - y;
        }
        if (op == "*") {
            return x * y;
        }
        if (op == "/") {
            return x / y;
        }
        return 0;
    }

    public double solve(Node node) {
        if(node == null) {
            return 0;
        }

        if(isLeaf(node)) {
            return Integer.valueOf(node.val);
        }

        double left = solve(node.left);
        double right = solve(node.right);

        return evaluate(node.val, left, right);
    }
}
