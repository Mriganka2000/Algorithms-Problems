public class Main {

    public static int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n + 1];

        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;

        for (int i = 0; i < n; i++) {
            for (int[] time : times) {
                int u = time[0];
                int v = time[1];
                int wt = time[2];

                if (dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + wt) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dist[i]);
        }

        return max == Integer.MAX_VALUE ? -1 : max;
    }

    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;

        System.out.println(networkDelayTime(times, n, k));
    }
}