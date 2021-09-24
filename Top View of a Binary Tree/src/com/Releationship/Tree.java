package com.Releationship;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

class QueueObj {
    public Node node;
    public int hd;

    public QueueObj(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class Tree {

    public Node root = null;

    public ArrayList<Integer> bfs(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if (root == null) {
            return arrayList;
        }
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            arrayList.add(temp.data);
            queue.poll();

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        return arrayList;
    }

    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        LinkedHashMap<Integer, ArrayList<Integer>> hashMap = new LinkedHashMap<Integer, ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        Queue<QueueObj> queue = new LinkedList<>();

        if (root == null) {
            return arrayList;
        }
        queue.add(new QueueObj(root, 0));

        while (!queue.isEmpty()) {
            Node temp = queue.peek().node;
            if (hashMap.containsKey(queue.peek().hd)) {
                ArrayList<Integer> list = hashMap.get(queue.peek().hd);
                list.add(temp.data);
                hashMap.put(queue.peek().hd, list);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(temp.data);
                hashMap.put(queue.peek().hd, list);
            }
            int val = queue.poll().hd;

            if (temp.left != null) {
                queue.add(new QueueObj(temp.left, val - 1));
            }
            if (temp.right != null) {
                queue.add(new QueueObj(temp.right, val + 1));
            }
        }

        for (int item : hashMap.keySet()) {
            arrayList.add(hashMap.get(item));
        }

        return arrayList;
    }
}
