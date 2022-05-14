package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> countSmaller(int[] num) {
        if (num == null || num.length == 0) {
            return new ArrayList<>();
        }

        int[] counts = new int[num.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int item : num) {
            min = Math.min(min, item);
            max = Math.max(max, item);
        }

        SegmentTree tree = new SegmentTree();

        SegmentTreeNode root = tree.buildTree(min, max);

        for (int i = num.length - 1; i >= 0; i--) {
            tree.update(root, num[i]);
            counts[i] = tree.sumRange(root, min, num[i] - 1);
        }

        List<Integer> ans = new ArrayList<>();

        for (int item : counts) {
            ans.add(item);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num = {5, 2, 6, 1};
        System.out.println(countSmaller(num));
    }
}
