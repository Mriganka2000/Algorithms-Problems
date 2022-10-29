import java.util.PriorityQueue;
import java.util.Queue;

class Pair {
    public int x;
    public int y;
    public double dist;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
        this.dist = Math.sqrt(Math.pow((this.x), 2) + Math.pow((this.y), 2));
    }
}

public class Main {

    public static int[][] kClosest(int[][] points, int k) {
        Queue<Pair> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.dist == o2.dist) {
                return 0;
            }
            else if (o1.dist > o2.dist) {
                return 1;
            }
            else {
                return -1;
            }
        });

        for (int[] point : points) {
            queue.add(new Pair(point[0], point[1]));
        }

        int n = 0;
        int[][] res = new int[k][2];
        while (k-- > 0) {
            Pair item = queue.poll();
            if (item != null) {
                res[n][0] = item.x;
                res[n][1] = item.y;
            }
            n++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1}, {-2,4}};
        int k = 2;
        int[][] res = kClosest(points, k);

        for (int i = 0; i < res.length; i++) {
            System.out.println("[" + res[i][0] + ", " + res[i][1] + "]");
        }
    }
}