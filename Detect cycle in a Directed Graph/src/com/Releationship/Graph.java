package com.Releationship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    public int V;
    public List<List<Integer>> adjacent;

    public Graph(int V) {
        this.V = V;
        this.adjacent = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjacent.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacent.get(source).add(destination);
    }

    private boolean isCycleUtil(int currentVertex, boolean visited[], boolean visiting[]) {
        if (visiting[currentVertex]) {
            return true;
        }
        if (visited[currentVertex]) {
            return false;
        }
        visited[currentVertex] = true;
        visiting[currentVertex] = true;
        List<Integer> child = adjacent.get(currentVertex);

        for (Integer item : child) {
            if (isCycleUtil(item, visited, visiting)) {
                return true;
            }
        }
        visiting[currentVertex] = false;
        return false;
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[V];
        boolean[] visiting = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (isCycleUtil(i, visited, visiting)) {
                return true;
            }
        }
        return false;
    }
}
