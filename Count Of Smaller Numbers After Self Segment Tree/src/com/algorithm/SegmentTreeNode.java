package com.algorithm;

public class SegmentTreeNode {
    public SegmentTreeNode left;
    public SegmentTreeNode right;

    public int start;
    public int end;
    public int sum;

    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
}
