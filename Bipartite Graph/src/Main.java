import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static boolean isBipartiteUtil(int v, ArrayList<ArrayList<Integer>> adj, int src, int[] color) {
        color[src] = 1;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            int start = queue.getFirst();
            queue.pop();

            if (adj.get(start).get(start) == 1) {
                return false;
            }

            for (int end = 0; end < v; end++) {
                if (adj.get(start).get(end) == 1 && color[end] == -1) {
                    color[end] = 3 - color[start];
                    queue.push(end);
                }
                else if (adj.get(start).get(end) == 1 && color[end] == color[start]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isBipartite(int v, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[v];

        for (int i = 0; i < v; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < v; i++) {
            if (color[i] == -1) {
                if (isBipartiteUtil(v, adj, i, color) == false) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] G = { { 0, 1, 0, 1 },
                { 1, 0, 1, 0 },
                { 0, 1, 0, 1 },
                { 1, 0, 1, 0 } };
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < G.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < G[0].length; j++) {
                graph.get(i).add(G[i][j]);
            }
        }

        boolean val = isBipartite(G.length, graph);

        System.out.println(val);
    }
}