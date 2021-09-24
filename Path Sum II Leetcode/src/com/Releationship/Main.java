package com.Releationship;

public class Main {

    public static void main(String[] args) {
	    Node root = new Node(5);
	    root.left = new Node(4);
	    root.left.left = new Node(11);
	    root.left.left.left = new Node(7);
	    root.left.left.right = new Node(2);
	    root.right = new Node(8);
	    root.right.left = new Node(13);
	    root.right.right = new Node(4);
	    root.right.right.left = new Node(5);
	    root.right.right.right = new Node(1);

	    Tree tree = new Tree();
//	    tree.inOrder(root);
	    int targetSum = 22;

		System.out.println(tree.pathSum(root, targetSum));
    }
}
