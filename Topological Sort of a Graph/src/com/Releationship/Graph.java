package com.Releationship;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    public int vertices;
    public ArrayList<ArrayList<Integer>> adjacent;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacent = new ArrayList<ArrayList<Integer>>(vertices);

        for (int i = 0; i < vertices; i++) {
            this.adjacent.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacent.get(source).add(destination);
    }

    public boolean haveCycleUtil(int vertex, boolean visited[], boolean hashSet[], ArrayList<ArrayList<Integer>> adjacent) {
        if (hashSet[vertex]) {
            return true;
        }
        if (visited[vertex]) {
            return false;
        }
        visited[vertex] = true;
        hashSet[vertex] = true;

        ArrayList<Integer> children = adjacent.get(vertex);

        for (int item : children) {
            if (haveCycleUtil(item, visited, hashSet, adjacent)) {
                return true;
            }
        }
        hashSet[vertex] = false;

        return false;
    }

    public boolean haveCycle(int vertices, ArrayList<ArrayList<Integer>> adjacent) {
        boolean[] visited = new boolean[vertices];
        boolean[] hashSet = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (haveCycleUtil(i, visited, hashSet, adjacent)) {
                return true;
            }
        }
        return false;
    }

    public void dfs(int vertex, ArrayList<ArrayList<Integer>> adjacent, Stack<Integer> stack, boolean[] visited) {
        visited[vertex] = true;
        for (int i = 0; i < adjacent.get(vertex).size(); i++) {
            if (!visited[adjacent.get(vertex).get(i)]) {
                dfs(adjacent.get(vertex).get(i), adjacent, stack, visited);
            }
        }
        stack.push(vertex);
    }

    public void topologicalSort(int vertices, ArrayList<ArrayList<Integer>> adjacent) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visisted = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            visisted[i] = false;
        }

        if (haveCycle(vertices, adjacent)) {
            System.out.println("Not possible");
            return;
        }

        for (int i = 0; i < vertices; i++) {
            if (!visisted[i]) {
                dfs(i, adjacent, stack, visisted);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
