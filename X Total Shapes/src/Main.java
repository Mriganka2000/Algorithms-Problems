public class Main {

    public static void dfs(char[][] grid, boolean[][] visited, int i, int j, int m, int n) {
        if (grid[i][j] == 'X' && !visited[i][j]) {
            visited[i][j] = true;

            if (i + 1 < m) {
                dfs(grid, visited, i + 1, j, m, n);
            }
            if (i - 1 >= 0) {
                dfs(grid, visited, i - 1, j, m, n);
            }
            if (j + 1 < n) {
                dfs(grid, visited, i, j + 1, m, n);
            }
            if (j - 1 >= 0) {
                dfs(grid, visited, i, j - 1, m, n);
            }
        }
    }

    public static int xShape(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'X' && !visited[i][j]) {
                    dfs(grid, visited, i, j, m, n);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {{'X','O','X'},
                        {'O','X','O'},
                        {'X','X','X'}
        };

        System.out.println(xShape(grid));
    }
}