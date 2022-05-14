package com.algorithm;

import java.util.Stack;

public class Tree {
    public void toDLL(TreeNode node) {
        List list = new List();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = node;

        while (!stack.empty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            }
            else {
                current = stack.pop();
                list.insert(current.data);
                current = current.right;
            }
        }

//        list.reverse();
        list.print();
    }
}
