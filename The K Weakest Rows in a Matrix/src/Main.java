import java.util.*;

public class Main
{
    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)->{
            return a[0] != b[0] ? b[0] - a[0] : b[1] - a[1];
        });
        int[] arr = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
                else {
                    break;
                }
            }
            queue.add(new int[]{count, i});
        }

        while (queue.size() > k) {
            queue.poll();
        }

        while (k > 0) {
            arr[--k] = queue.poll()[1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int k = 3;
        int[] res = kWeakestRows(mat, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}


