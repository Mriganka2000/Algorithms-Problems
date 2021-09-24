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
	    tree.root.right.left = new Node(6);
	    tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.root.right.right.right = new Node(9);

//        ArrayList<Integer> arrayList = tree.bfs(tree.root);
//        for (int item : arrayList) {
//            System.out.println(item);
//        }

		ArrayList<ArrayList<Integer>> arrayList = tree.verticalOrder(tree.root);

		for (ArrayList<Integer> item : arrayList) {
			System.out.println(item);
		}
    }
}
