package com.Releationship;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[] index = {0, 1, 2, 1 ,2};
        int[] identity = {0, 1, 2, 3, 4};

        int[] result = new int[identity.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < identity.length; i++) {
            if (result[index[i]] == -1) {
                result[i] = identity[i];
            }
            else {
                int j = index[i];
                while (result[j] != -1) {
                    queue.add(result[j]);
                    j++;
                }
                result[index[i]] = identity[i];
                int n = index[i] + 1;
                while (!queue.isEmpty()) {
                    result[n++] = queue.peek();
                    queue.remove();
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}