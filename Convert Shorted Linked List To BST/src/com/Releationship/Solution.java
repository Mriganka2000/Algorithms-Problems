package com.Releationship;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> arr;

    private void convert(ListNode head) {
        arr = new ArrayList<Integer>();

        while(head != null) {
            arr.add(head.val);
            head = head.next;
        }
    }

    private TreeNode sortedListToBST(int l, int r) {
        if(l > r) {
            return null;
        }

        int mid = (l + r) / 2;
        TreeNode t = new TreeNode(arr.get(mid));

        if(l == r) {
            return t;
        }

        t.left = sortedListToBST(l, mid-1);
        t.right = sortedListToBST(mid+1, r);
        return t;
    }

    public TreeNode sortedListToBST(ListNode head) {
        convert(head);

        return sortedListToBST(0, arr.size()-1);
    }

    public ListNode insert(ListNode head, int val) {
        if(head == null) {
            head = new ListNode(val);
            return head;
        }
        else {
            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new ListNode(val);
            return head;
        }
    }

    public void printList(ListNode head) {
        if(head != null) {
            while (head != null) {
                System.out.println(head.val);
                head = head.next;
            }
        }
    }

    public void printTree(TreeNode root) {
        if(root != null) {
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }
}
