public class Main {

    public static void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        int[] dirX = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dirY = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

        visited[i][j] = true;

        for (int k = 0; k < dirX.length; k++) {
            int newX = dirX[k] + i;
            int newY = dirY[k] + j;
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == '1' && !visited[newX][newY]) {
                dfs(grid, visited, newX, newY);
            }
        }
    }

    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'0', '1'},
                {'1', '0'},
                {'1', '1'},
                {'1', '0'}
        };
        System.out.println(numIslands(grid));
    }
}