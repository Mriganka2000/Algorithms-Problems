public class DisjointSet {

    public int find(int[] arr, int x) {
        if (arr[x] == x) {
            return x;
        }
        return find(arr, arr[x]);
    }

    public void unionSet(int[] arr, int u, int v) {
        u = find(arr, u);
        v = find(arr, v);

        if (u != v) {
            arr[v] = u;
        }
    }
}
