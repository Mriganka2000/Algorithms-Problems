import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Cell {
        public int x;
        public int y;
        public int distance;

        public Cell(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    static class DistanceComparator implements Comparator<Cell> {

        @Override
        public int compare(Cell o1, Cell o2) {
            if (o1.distance < o2.distance) {
                return -1;
            }
            else if (o1.distance > o2.distance) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    public static boolean isInsideGrid(int i, int j, int ROW, int COL) {
        return (i >= 0 && i < ROW && j >= 0 && j < COL);
    }

    public static int minimumCostPath(int[][] grid) {
        int[][] dist = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        dist[0][0] = grid[0][0];

        PriorityQueue<Cell> queue = new PriorityQueue<>(grid.length * grid[0].length, new DistanceComparator());
        queue.add(new Cell(0, 0, dist[0][0]));

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newRow = curr.x + dx[i];
                int newCol = curr.y + dy[i];

                if (isInsideGrid(newRow, newCol, grid.length, grid[0].length)) {
                    if (dist[newRow][newCol] > dist[curr.x][curr.y] + grid[newRow][newCol]) {
                        if (dist[newRow][newRow] != Integer.MAX_VALUE) {
                            Cell adj = new Cell(newRow, newCol, dist[newRow][newCol]);
                            queue.remove(adj);
                        }
                        dist[newRow][newCol] = dist[curr.x][curr.y] + grid[newRow][newCol];
                        queue.add(new Cell(newRow, newCol, dist[newRow][newCol]));
                    }
                }
            }
        }

        return dist[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] grid = { { 31, 100, 65, 12, 18 },
                        { 10, 13, 47, 157, 6 },
                        { 100, 113, 174, 11, 33 },
                        { 88, 124, 41, 20, 140 },
                        { 99, 32, 111, 41, 20 }
        };

        System.out.println(minimumCostPath(grid));
    }
}