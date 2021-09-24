package com.Releationship;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);

        System.out.println("Spiral Order traversal of Binary Tree is :- ");
        ArrayList<Integer> arrayList = tree.zigzagTraversal(tree.root);

        for (int item:arrayList) {
            System.out.println(item);
        }
    }
}
