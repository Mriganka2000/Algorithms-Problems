package com.algorithm;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    static int maxLevel = 0;

    void rightViewUtil(Node node, int level) {
        if (node == null)
            return;
        if (maxLevel < level) {
            System.out.print(node.data + " ");
            maxLevel = level;
        }
        rightViewUtil(node.right, level + 1);
        rightViewUtil(node.left, level + 1);
    }

    public void rightView() {
        rightView(root);
    }

    public void rightView(Node node) {
        rightViewUtil(node, 1);
    }
}
public class Main {

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        tree.rightView();
    }
}
