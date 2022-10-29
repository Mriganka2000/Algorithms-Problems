public class Main {

    public static int knapSack(int w, int[] wt, int[] val, int n) {
        int[][] table = new int[n + 1][w + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                }
                else if (wt[i - 1] <= j) {
                    table[i][j] = Math.max(val[i - 1] + table[i - 1][j - wt[i - 1]], table[i - 1][j]);
                }
                else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }

        return table[n][w];
    }

    public static void main(String[] args) {
        int[] val = new int[] { 60, 100, 120 };
        int[] wt = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        System.out.println(knapSack(W, wt, val, n));
    }
}