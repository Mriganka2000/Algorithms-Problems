package com.Releationship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static int countComponents(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == false)
                count++;
                dfs(adj, i, visited);
            }
        }

        return count;
    }

    public static void dfs(HashMap<Integer, List<Integer>> adj, int index, boolean[] visited) {
        visited[index] = true;

        for (Integer i : adj.get(index)) {
            if (visited[i] == false) {
                dfs(adj, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
	    int[][] edges = {{0, 1}, {1, 2}, {2, 0}, {3, 4}};
        System.out.println(countComponents(n, edges));
    }
}
