public class Main {

    public static int sortedCount(int N, int M, int[][] mat) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            int j = 0;
            for (j = 0; j < mat[0].length - 1; j++) {
                if (mat[i][j] > mat[i][j + 1]) {
                    break;
                }
            }
            if (j == mat[0].length - 1) {
                count++;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int j = 0;
            for (j = 0; j < mat[0].length - 1; j++) {
                if (mat[i][j] < mat[i][j + 1]) {
                    break;
                }
            }
            if (mat[0].length > 1 && j == mat[0].length - 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String [] args) {
        int n = 3, m = 3;
        int[][] mat = {{1, 2, 3}, {6, 5, 4}, {7, 8, 2}};
        System.out.println(sortedCount(n, m, mat));
    }
}