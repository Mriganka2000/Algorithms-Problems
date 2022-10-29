import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static long findMinDiff (ArrayList<Integer> arr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (n < m) {
            return -1;
        }

        Collections.sort(arr);

        long minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            long diff = arr.get(i + m - 1) - arr.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int n = 8, m = 5;
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};

        ArrayList<Integer> list = new ArrayList<>();
        for (int item : arr) {
            list.add(item);
        }

        System.out.println(findMinDiff(list, n, m));
    }
}