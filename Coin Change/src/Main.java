public class Main {

    public static long count(int[] arr, int m, int n) {
        long[] table = new long[n + 1];
        table[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = arr[i]; j <= n; j++) {
                table[j] += table[j - arr[i]];
            }
        }

        return table[n];
    }

    public static void main(String[] args) {
        int n = 10 , m = 4;
        int[] arr = {2, 5, 3, 6};
        System.out.println(count(arr, m, n));
    }
}