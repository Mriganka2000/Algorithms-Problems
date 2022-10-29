import java.util.Arrays;

public class Main {

    public static long primeSum(int n) {
        boolean[] value = new boolean[n + 1];

        Arrays.fill(value, true);

        for (int p = 2; p * p <= n; p++) {
            if (value[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    value[i] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (value[i]) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(primeSum(n));
    }
}