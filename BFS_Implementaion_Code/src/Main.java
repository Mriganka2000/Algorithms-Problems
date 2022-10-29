import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {
    public int vertex;
    public List<Integer>[] adjacent;

    public Graph(int vertex) {
        this.vertex = vertex;
        this.adjacent = new List[this.vertex];

        for (int i = 0; i < this.vertex; i++) {
            this.adjacent[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        this.adjacent[source].add(destination);
        this.adjacent[destination].add(source);
    }

    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[this.vertex];

        for (int i = 0; i < this.vertex; i++) {
            visited[i] = false;
        }

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int front = queue.poll();
            System.out.println(front);

            for (int neighbour : this.adjacent[front]) {
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int front = queue.poll();
            result.add(front);

            for (int neighbour : adj.get(front)) {
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }

        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(4, 5);
        g.addEdge(0, 4);
        g.addEdge(3, 4);

        g.bfs(1);
    }
}