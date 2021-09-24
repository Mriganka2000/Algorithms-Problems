package com.Releationship;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Tree {

    public Node root = null;

    public void topView(Node root) {
        class QueueNode {
            Node node;
            int horizontalDistance;

            public QueueNode(Node node, int horizontalDistance) {
                this.node = node;
                this.horizontalDistance = horizontalDistance;
            }
        }

        Queue<QueueNode> queue = new LinkedList<>();
        Map<Integer, Node> topVIewMap = new HashMap<>();

        if (root == null) {
            return;
        }
        else {
            queue.add(new QueueNode(root, 0));
        }

        while (!queue.isEmpty()) {
            QueueNode queueNode = queue.poll();
            if (!topVIewMap.containsKey(queueNode.horizontalDistance)) {
                topVIewMap.put(queueNode.horizontalDistance, queueNode.node);
            }
            if (queueNode.node.left != null) {
                queue.add(new QueueNode(queueNode.node.left, queueNode.horizontalDistance - 1));
            }
            if (queueNode.node.right != null) {
                queue.add(new QueueNode(queueNode.node.right, queueNode.horizontalDistance + 1));
            }
        }

        for (Map.Entry<Integer, Node> entry : topVIewMap.entrySet()) {
            System.out.println(entry.getValue().data);
        }
    }

}
