package com.Releationship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] dislike : dislikes) {
            adj.get(dislike[0]-1).add(dislike[1]-1);
            adj.get(dislike[1]-1).add(dislike[0]-1);
        }

        int[] visited = new int[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0 && !dfs(adj, visited, i, 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean dfs(HashMap<Integer, List<Integer>> adj, int[] visited, int person, int group) {
        visited[person] = group;

        for (int j : adj.get(person)) {
            if (visited[j] == group) {
                return false;
            }
            if (visited[j] == 0 && !dfs(adj, visited, j, -group)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] dislikes = {{1,2}, {1,3}, {2,4}};
        System.out.println(possibleBipartition(n, dislikes));
    }
}
