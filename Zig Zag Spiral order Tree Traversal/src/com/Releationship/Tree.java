package com.Releationship;

import java.util.ArrayList;
import java.util.Stack;

public class Tree {
    public Node root;

    public void inOrder() {
        if (root == null) {
            System.out.println("Nothing to print");
        }
        else {
            inOrder(root);
        }
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public ArrayList<Integer> zigzagTraversal(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) {
            return arrayList;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                Node temp = stack1.peek();
                stack1.pop();
                arrayList.add(temp.data);

                if (temp.right != null) {
                    stack2.push(temp.right);
                }
                if (temp.left != null) {
                    stack2.push(temp.left);
                }
            }

            while (!stack2.isEmpty()) {
                Node temp = stack2.peek();
                stack2.pop();
                arrayList.add(temp.data);

                if (temp.left != null) {
                    stack1.push(temp.left);
                }
                if (temp.right != null) {
                    stack1.push(temp.right);
                }
            }
        }
        return arrayList;
    }
}
