package com.Releationship;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static boolean courseDone(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || numCourses == 0 || prerequisites.length == 0) {
            return true;
        }

        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] item : prerequisites) {
            adj.get(item[1]).add(item[0]);
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(adj, i, visited)) {
                return false;
            }
        }

        return true;
    }

    public static boolean dfs(HashMap<Integer, ArrayList<Integer>> adj, int i, int[] visited) {
        if (visited[i] == -1) {
            return false;
        }
        if (visited[i] == 1) {
            return true;
        }

        visited[i] = -1;
        if (adj.containsKey(i)) {
            for (int j : adj.get(i)) {
                if (!dfs(adj, j, visited)) {
                    return false;
                }
            }
        }
        visited[i] = 1;
        return true;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}, {0,1}};
        System.out.println(courseDone(numCourses, prerequisites));
    }
}
