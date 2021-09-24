package com.Releationship;

class Node<T> {
    public T data;
    public Node left;
    public Node right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree<T> {
    public Node root;

    public void mirror() {
        root = mirror(root);
    }

    private Node mirror(Node node) {
        if(node == null) {
            return node;
        }

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
}

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        tree.root = new Node<Integer>(1);
        tree.root.left = new Node<Integer>(2);
        tree.root.right = new Node<Integer>(3);
        tree.root.left.left = new Node<Integer>(4);
        tree.root.left.right = new Node<Integer>(5);
        tree.inOrder();
        System.out.println();
        tree.mirror();
        tree.inOrder();
    }
}
