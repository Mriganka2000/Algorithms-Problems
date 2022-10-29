package com.algorithm.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class State {
    public int node;
    public double probability;

    public State(int node, double probability) {
        this.node = node;
        this.probability = probability;
    }
}

public class Main {

    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        HashMap<Integer, List<double[]>> graph = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];

            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());

            graph.get(edge[0]).add(new double[] {edge[1], succProb[i]});
            graph.get(edge[1]).add(new double[] {edge[0], succProb[i]});
        }

        double[] probs = new double[n];
        PriorityQueue<State> queue = new PriorityQueue<>((a, b) -> ((Double) b.probability).compareTo((Double) a.probability));
        queue.add(new State(start, 1.0));

        while (!queue.isEmpty()) {
            State state = queue.poll();
            int current = state.node;
            double prob = state.probability;

            if (current == end) {
                return prob;
            }

            for (double[] child : graph.getOrDefault(current, new ArrayList<>())) {
                if (probs[(int) child[0]] >= prob * child[1]) {
                    continue;
                }
                queue.add(new State((int) child[0], prob * child[1]));
                probs[(int) child[0]] = prob * child[1];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb = {0.5,0.5,0.2};
        int start = 0, end = 2;
        System.out.println(maxProbability(n, edges, succProb, start, end));
    }
}