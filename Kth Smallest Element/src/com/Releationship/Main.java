package com.Releationship;

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

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    public int kthSmallestElement(Node node, int k) {
        int[] num = new int[2];
        num[1] = -1;
        inorder(node, num, k);
        return num[1];
    }

    public void inorder(Node node, int num[], int k) {
        if(node == null) {
            return;
        }
        inorder(node.left, num, k);
        if(++num[0] == k) {
            num[1] = node.data;
            return;
        }
        inorder(node.right, num, k);
    }
}

public class Main {
    public static void main (String[] args) {
        Tree tree_level = new Tree();
        tree_level.root = new Node(20);
        tree_level.root.left = new Node(10);
        tree_level.root.right = new Node(30);
        System.out.println(tree_level.kthSmallestElement(tree_level.root, 5));
    }
}
