import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] stack, ArrayList<ArrayList<Integer>> adj) {
        if (stack[vertex]) {
            return true;
        }
        if (visited[vertex]) {
            return false;
        }

        visited[vertex] = true;
        stack[vertex] = true;

        List<Integer> children = adj.get(vertex);

        for (Integer child : children) {
            if (isCyclicUtil(child, visited, stack, adj)) {
                return true;
            }
        }
        stack[vertex] = false;

        return false;
    }

    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v];
        boolean[] stack = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (isCyclicUtil(i, visited, stack, adj)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adjacent = new ArrayList<>();

        int v = scanner.nextInt();
        int e = scanner.nextInt();

        for (int i = 0; i < v; i++) {
            adjacent.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            adjacent.get(start).add(end);
        }

        System.out.println(isCyclic(v, adjacent));
    }
}