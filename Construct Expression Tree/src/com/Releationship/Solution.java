package com.Releationship;

import java.util.Stack;

public class Solution {
    private boolean isOperator(char val) {
        return (val == '+' || val == '-' || val == '*' || val == '/');
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.val);
        }
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        if (isOperator(node.val)) {
            System.out.print("(");
        }

        inOrder(node.left);
        System.out.print(node.val);
        inOrder(node.right);

        if (isOperator(node.val)) {
            System.out.print(")");
        }
    }

    public Node construct(String postfix) {
        Stack<Node> s = new Stack<Node>();

        for (char c : postfix.toCharArray()) {
            if(isOperator(c)) {
                Node x = s.pop();
                Node y = s.pop();

                Node node = new Node(c, y, x);

                s.add(node);
            }
            else {
                s.add(new Node(c));
            }
        }
        return s.peek();
    }
}
