import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                }
                else if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int time = 0;

        while (!queue.isEmpty() & freshCount > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] dir : DIRS) {
                    int nextX = current[0] + dir[0];
                    int nextY = current[1] + dir[1];
                    if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length || grid[nextX][nextY] != 1) {
                        continue;
                    }
                    queue.offer(new int[] {nextX, nextY});
                    grid[nextX][nextY] = 2;
                    freshCount--;
                }
            }

            time++;
        }

        return freshCount == 0 ? time : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println(orangesRotting(grid));
    }
}