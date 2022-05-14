package com.algorithm;

public class SegmentTree {

    public SegmentTreeNode buildTree(int start, int end) {
        if (start > end) {
            return null;
        }

        SegmentTreeNode newNode = new SegmentTreeNode(start, end);

        if (start == end) {
            return newNode;
        }

        int mid = start + (end - start) / 2;
        newNode.left = buildTree(start, mid);
        newNode.right = buildTree(mid + 1, end);

        return newNode;
    }

    public void update(SegmentTreeNode node, int index) {
        if (node == null) {
            return;
        }

        if (node.start == index && node.end == index) {
            node.sum += 1;
            return;
        }

        int mid = node.start + (node.end - node.start) / 2;

        if (index <= mid) {
            update(node.left, index);
        }
        else {
            update(node.right, index);
        }

        node.sum = node.left.sum + node.right.sum;
    }

    public int sumRange(SegmentTreeNode root, int start, int end) {
        if (root == null|| start > end) {
            return 0;
        }

        if (root.start == start && root.end == end) {
            return root.sum;
        }

        int mid = root.start + (root.end - root.start) / 2;

        if (end <= mid) {
            return sumRange(root.left, start, end);
        }
        else if (start > mid) {
            return sumRange(root.right, start, end);
        }

        return sumRange(root.left, start, mid) + sumRange(root.right, mid + 1, end);
    }

}
