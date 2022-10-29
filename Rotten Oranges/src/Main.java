import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int orangesRotting(int[][] grid) {
        int days = 0, fresh = 0;
        Queue<Integer[]> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                else if (grid[i][j] == 2){
                    Integer[] temp = {i, j};
                    queue.add(temp);
                }
            }
        }

        int[][] dirs = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        while (!queue.isEmpty()) {
            int n = queue.size();
            boolean rotten = false;
            for (int i = 0; i < n; i++) {
                Integer[] x = queue.poll();
                for (int[] dir : dirs) {
                    int newX = x[0] + dir[0];
                    int newY = x[1] + dir[1];
                    if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        Integer[] arr = {newX, newY};
                        queue.add(arr);
                        fresh--;
                        rotten = true;
                    }
                }
            }

            if (rotten) {
                days++;
            }
        }

        return fresh != 0 ? -1 : days;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,1,2},
                {0,1,2},
                {2,1,1}
        };
        System.out.println(orangesRotting(grid));
    }
}