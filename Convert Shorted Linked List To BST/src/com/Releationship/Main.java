package com.Releationship;

public class Main {

    public static void main(String[] args) {
	    ListNode head = null;
	    Solution s = new Solution();
	    head = s.insert(head, -10);
		head = s.insert(head, -3);
		head = s.insert(head, 0);
		head = s.insert(head, 5);
		head = s.insert(head, 9);
		System.out.println("The List is :- ");
		s.printList(head);
	    TreeNode root = s.sortedListToBST(head);
		System.out.println("The tree is :- ");
	    s.printTree(root);
    }
}
