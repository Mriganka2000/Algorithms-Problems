import java.util.LinkedList;
import java.util.List;

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

    private void dfs(int start, boolean[] visited) {
        System.out.println(start);
        visited[start] = true;

        for (int neighbour : this.adjacent[start]) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }

        return;
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[this.vertex];

        for (int i = 0; i < this.vertex; i++) {
            visited[i] = false;
        }

        dfs(start, visited);
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

        g.dfs(1);
    }
}