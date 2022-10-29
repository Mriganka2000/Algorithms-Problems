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

    public void printGraph() {
        for (int source = 0; source < this.vertex; source++) {
            if (this.adjacent[source].size() > 0) {
                System.out.print("Vertex " + source + " is connected to :- ");
                for (int destination : this.adjacent[source]) {
                    System.out.print(destination + " ");
                }
                System.out.println();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}