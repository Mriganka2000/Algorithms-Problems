package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int pageFaults(int[] pages, int capacity) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < pages.length; i++) {
            if (!queue.contains(pages[i])) {
                if (queue.size() == capacity) {
                    queue.remove();
                }
                queue.add(pages[i]);
                count++;
            }
            else {
                queue.remove(pages[i]);
                queue.add(pages[i]);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] pages = { 1, 2, 1, 4, 2, 3, 5 };
        int n = 7, c = 3;

        System.out.println(pageFaults(pages, c));
    }
}
