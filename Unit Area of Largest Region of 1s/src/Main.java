public class Main {

    private static int count = 0;

    private static boolean isSafe(int[][] grid, int row, int col, boolean[][] visited) {
        return ((row >= 0) && (row < grid.length) && (col >= 0) && (col < grid[0].length) && grid[row][col] == 1 && !visited[row][col]);
    }

    private static void dfs(int[][] grid, int row, int col, boolean[][] visited) {
        int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };

        visited[row][col] = true;

        for (int i = 0; i < 8; i++) {
            if (isSafe(grid, row + rowNbr[i], col + colNbr[i], visited)) {
                count++;
                dfs(grid, row + rowNbr[i], col + colNbr[i], visited);
            }
        }
    }

    public static int findMaxArea(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dfs(grid, i, j, visited);
                    result = Math.max(result, count);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 1, 1, 0 },
                        { 1, 0, 1, 1, 0 },
                        { 0, 1, 0, 0, 0 },
                        { 0, 0, 0, 0, 1 }
        };

        System.out.println(findMaxArea(grid));
    }
}