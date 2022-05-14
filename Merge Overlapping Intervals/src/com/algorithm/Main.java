package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.Collections;

class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {

    public static void mergeIntervals(Interval[] arr) {
        if (arr.length <= 0) {
            return;
        }

        Stack<Interval> stack = new Stack<>();

        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Interval top = stack.peek();

            if (top.end < arr[i].start) {
                stack.push(arr[i]);
            }
            else if (top.end < arr[i].end){
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        ArrayList<Interval> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        Collections.reverse(list);

        for (Interval interval : list) {
            System.out.println(interval.start + ", " + interval.end);
        }
    }

    public static void main(String[] args) {
        Interval[] arr =new Interval[4];
        arr[0] = new Interval(6,8);
        arr[1] = new Interval(1,9);
        arr[2] = new Interval(2,4);
        arr[3] = new Interval(4,7);
        mergeIntervals(arr);
    }
}
