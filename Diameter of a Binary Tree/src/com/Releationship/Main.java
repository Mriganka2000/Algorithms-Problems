package com.Releationship;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.diameter(tree.root));

        ArrayList<Integer> arrayList = tree.leftView(tree.root);

        for (int item:arrayList) {
            System.out.println(item);
        }
    }
}
