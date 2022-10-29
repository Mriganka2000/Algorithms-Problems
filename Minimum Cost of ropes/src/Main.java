import java.util.PriorityQueue;

public class Main {

    public static long minCost(long[] arr, int n) {
        PriorityQueue<Long> queue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        int ans = 0;
        while (queue.size() > 1) {
            long first = queue.poll();
            long second = queue.poll();

            ans += first + second;
            queue.add(first + second);
        }

        return ans;
    }

    public static void main(String[] args) {
        long[] len = { 4, 3, 2, 6 };
        System.out.println(minCost(len, len.length));
    }
}