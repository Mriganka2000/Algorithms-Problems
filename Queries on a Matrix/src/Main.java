public class Main {

    public static int[][] solveQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            matrix[queries[i][0]][queries[i][1]]++;
            matrix[queries[i][0]][queries[i][3] + 1]--;
            matrix[queries[i][2]][queries[i][2]]--;
            matrix[queries[i][2]][queries[i][3]]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                matrix[j][i] += matrix[j - 1][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 6, q = 6;
        int[][] queries = {
                        {4,0,5,3},
                        {0,0,3,4},
                        {1,2,1,2},
                        {1,1,2,3},
                        {0,0,3,1},
                        {1,0,2,4}
        };

        int[][] matrix = solveQueries(n, queries);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}