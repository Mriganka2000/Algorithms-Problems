import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static boolean validColor(int[][] graph, int[] color, int currentColor, int start) {
        if (color[start] != 0) {
            return color[start] == currentColor;
        }
        color[start] = currentColor;

        for (int node : graph[start]) {
            if (!validColor(graph, color, -currentColor, node)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == 0 && !validColor(graph, color, 1, i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isBipartiteBFS(int[][] graph) {
        int[] color = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 1;

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int item : graph[node]) {
                        if (color[item] == color[node]) {
                            return false;
                        }
                        else if (color[item] == 0){
                            queue.add(item);
                            color[item] = -color[node];
                        }
                    }
                }
            }
        }

        return true;
    }

    public static int[] parent;

    public static int find(int point) {
        if (parent[point] == point) {
            return point;
        }
        parent[point] = find(parent[point]);
        return parent[point];
    }

    public static void union(int x, int y) {
        int a = find(x);
        int b = find(y);

        if (a != b) {
            parent[a] = b;
        }
    }

    public static boolean isBipartiteUnionFind(int[][] graph) {
        parent = new int[graph.length];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < graph.length; i++) {
            for (int node : graph[i]) {
                if (find(i) == find(node)) {
                    return false;
                }
                union(node, graph[i][0]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartiteUnionFind(graph));
    }
}