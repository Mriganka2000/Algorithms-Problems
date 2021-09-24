package com.Releationship;

import java.util.ArrayList;
import java.util.Stack;

public class Tree {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();

        Node curr = root;

        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.data);
            curr = curr.right;
        }

        return list;
    }

    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();

        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                list.add(curr.data);
                curr = curr.left;
            }
            curr = stack.pop();
            curr = curr.right;
        }

        return list;
    }

    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(root == null) {
            return arrayList;
        }

        Stack<Node> stack = new Stack<>();
        Stack<Integer> out = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            out.push(curr.data);

            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        while (!out.isEmpty()) {
            arrayList.add(out.pop());
        }

        return arrayList;
    }
}
