package com.Releationship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    public Node root;

    public Node lca(Node node, int n1, int n2) {
        if (node == null) {
            return node;
        }

        if(node.data > n1 && node.data > n2) {
            return lca(node.left, n1, n2);
        }

        if(node.data < n1 && node.data < n2) {
            return lca(node.right, n1, n2);
        }

        return node;
    }

    public ArrayList<Integer> levelOrder(Node node) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            arrayList.add(current.data);

            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }

        return arrayList;
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    public void reverseLevelOrder(Node node) {
        Stack<Integer> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            stack.push(temp.data);
            if(temp.right != null) {
                queue.add(temp.right);
            }
            if (temp.left != null) {
                queue.add(temp.left);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

public class Main {
    public static void main (String[] args) {
        Tree tree_level = new Tree();
        tree_level.root = new Node(10);
        tree_level.root.left = new Node(20);
        tree_level.root.right = new Node(30);
        tree_level.root.left.left = new Node(40);
        tree_level.root.left.right = new Node(60);

        ArrayList<Integer> result = tree_level.levelOrder(tree_level.root);

        for (int item:result) {
            System.out.println(item);
        }

        System.out.println();
        tree_level.reverseLevelOrder(tree_level.root);
    }
}
