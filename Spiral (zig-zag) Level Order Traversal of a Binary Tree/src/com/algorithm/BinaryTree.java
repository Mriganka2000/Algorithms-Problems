package com.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;

public class BinaryTree {

    public void zigzagTraversal(Node root) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.empty() || !stack2.empty()) {
            while (!stack1.empty()) {
                Node temp = stack1.pop();
                System.out.println(temp.data);

                if (temp.left != null) {
                    stack2.push(temp.left);
                }
                if (temp.right != null) {
                    stack2.push(temp.right);
                }
            }

            while (!stack2.empty()) {
                Node temp = stack2.pop();
                System.out.println(temp.data);

                if (temp.right != null) {
                    stack1.push(temp.right);
                }
                if (temp.left != null) {
                    stack1.push(temp.left);
                }
            }
        }
    }

    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null)
            return res;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        boolean zigzag  = false;

        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (zigzag) {
                    level.add(0, node.data);
                } else {
                    level.add(node.data);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
            zigzag = !zigzag;
        }
        return res;
    }
}
