public class Main {

    public static int[] parent;

//    public static int find(int node) {
//        if (parent[node] == node) {
//            return node;
//        }
//        parent[node] = find(parent[node]);
//        return parent[node];
//    }

    public static int find(int node) {
        while (parent[node] != node) {
            node = parent[node];
        }

        return node;
    }

    public static void union(int x, int y) {
        int parentX = find(x);
        int parentY = find(y);

        if (parentX != parentY) {
            parent[parentY] = parentX;
        }
    }

    public static int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length + 1];

        for (int i = 0; i <= edges.length; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            if (find(edge[0]) == find(edge[1])) {
                return edge;
            }
            union(edge[0], edge[1]);
        }

        return null;
    }

    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        int[] res = findRedundantConnection(edges);

        for (int re : res) {
            System.out.println(re);
        }
    }
}