package com.algorithm;

import java.util.*;

public class Tree {

    public void topView(Node root) {
        class QueueNode {
            Node node;
            int hd;

            QueueNode(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        Queue<QueueNode> queue = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();

        if (root == null) {
            return;
        }
        else {
            queue.add(new QueueNode(root, 0));
        }

        while (!queue.isEmpty()) {
            QueueNode temp = queue.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node);
            }

            if (temp.node.left != null) {
                queue.add(new QueueNode(temp.node.left, temp.hd - 1));
            }
            if (temp.node.right != null) {
                queue.add(new QueueNode(temp.node.right, temp.hd + 1));
            }
        }
        for (Map.Entry<Integer, Node> entry : map.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
    }

    public  Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

}
