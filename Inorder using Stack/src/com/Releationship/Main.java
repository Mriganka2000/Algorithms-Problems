package com.Releationship;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right = new Node(3);

        Tree tree = new Tree();
        ArrayList<Integer> arrayList = tree.inOrder(node);
        System.out.println(arrayList);
        ArrayList<Integer> arrayList1 = tree.preOrder(node);
        System.out.println(arrayList1);
        ArrayList<Integer> arrayList2 = tree.postOrder(node);
        System.out.println(arrayList2);
    }
}
