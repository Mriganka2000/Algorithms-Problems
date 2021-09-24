package com.Releationship;

import java.util.*;

public class Graph {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        HashMap<Node, Node> hashMap = new HashMap<>();
        Node cloneNode = new Node(node.data, new ArrayList<>());
        hashMap.put(node, cloneNode);

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Node originalNode : currentNode.neighbors) {
                if (!hashMap.containsKey(originalNode)) {
                    Node newCloneNode = new Node(originalNode.data, new ArrayList<>());
                    hashMap.put(originalNode, newCloneNode);
                    queue.add(originalNode);
                }
                hashMap.get(currentNode).neighbors.add(hashMap.get(originalNode));
            }
        }

        return cloneNode;
    }

    public void printBFS(Node node) {
        if (node == null) {
            System.out.println("Nothing to print");
            return;
        }
        HashSet<Node> hashSet = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        hashSet.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.data);

            for (Node item : current.neighbors) {
                if (!hashSet.contains(item)) {
                    queue.add(item);
                    hashSet.add(item);
                }
            }
        }
    }
}
