import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static boolean isCyclicUtil(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited, int parent) {
        visited[v] = true;
        ArrayList<Integer> neighbours = adj.get(v);

        for (int neighbour : neighbours) {
            if (!visited[neighbour]) {
                if (isCyclicUtil(adj, neighbour, visited, v)) {
                    return true;
                }
            }
            else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }

    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(adj, i, visited, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = scanner.nextInt();
        int e = scanner.nextInt();

        for (int i = 0; i < v; i++) {
            adj.add(i, new ArrayList<>());
        }

        for (int j = 0; j < e; j++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            adj.get(start).add(end);
            adj.get(end).add(start);
        }

        System.out.println(isCycle(v, adj));
    }
}