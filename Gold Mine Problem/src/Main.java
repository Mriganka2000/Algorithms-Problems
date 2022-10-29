public class Main {

    public static int max(int a, int b, int c) {
        return (a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

    public static int maxGold(int n, int m, int[][] grid) {
        for (int j = grid[0].length - 2; j >= 0; j--){
            for (int i = 0; i < grid.length; i++) {
                int a = 0, b = 0, c = 0;
                if (i - 1 >= 0) {
                    a = grid[i][j] + grid[i - 1][j + 1];
                }
                b = grid[i][j] + grid[i][j + 1];
                if (i + 1 < grid.length) {
                    c = grid[i][j] + grid[i + 1][j + 1];
                }
                grid[i][j] = max(a, b, c);
            }
        }

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            if (res < grid[i][0]) {
                res = grid[i][0];
            }
        }

//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                System.out.print(grid[i][j] + " ");
//            }
//            System.out.println();
//        }

        return res;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] grid = {{1, 3, 3},
                        {2, 1, 4},
                        {0, 6, 4}
        };
        int res = maxGold(n, m, grid);
        System.out.println(res);
    }
}