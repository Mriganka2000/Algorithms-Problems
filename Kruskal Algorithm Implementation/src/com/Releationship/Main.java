package com.Releationship;

import java.util.Arrays;

public class Main {
    public int[] parent;
    public int[] rank;

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        else {
            return find(parent[x]);
        }
    }

    public void union(int x, int y) {
        int x_rep = find(x);
        int y_rep = find(y);

        if (x_rep == y_rep) {
            return;
        }
        parent[y_rep] = x_rep;
    }

    public int mst(Edge arr[], int v) {
        Arrays.sort(arr);
        parent = new int[v];
        rank = new int[v];

        for (int i = 0; i < v; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int result = 0;
        for (int i = 0, s = 0; s < v-1; i++) {
            Edge e = arr[i];
            int x = find(e.src);
            int y = find(e.dest);

            if (x != y) {
                result += e.weight;
                union(x, y);
                s++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices in graph
        int E = 5; // Number of edges in graph
        Main graph = new Main();
        Edge[] edge = new Edge[E];

        // add edge 0-1
        edge[0] = new Edge(0, 1, 10);
        edge[0].src = 0;
        edge[0].dest = 1;
        edge[0].weight = 10;

        // add edge 0-2
        edge[1] = new Edge(0, 2, 6);
        edge[1].src = 0;
        edge[1].dest = 2;
        edge[1].weight = 6;

        // add edge 0-3
        edge[2] = new Edge(0, 3, 5);
        edge[2].src = 0;
        edge[2].dest = 3;
        edge[2].weight = 5;

        // add edge 1-3
        edge[3] = new Edge(1, 3, 15);
        edge[3].src = 1;
        edge[3].dest = 3;
        edge[3].weight = 15;

        // add edge 2-3
        edge[4] = new Edge(2, 3, 4);
        edge[4].src = 2;
        edge[4].dest = 3;
        edge[4].weight = 4;

        System.out.println(graph.mst(edge, V));
    }
}
