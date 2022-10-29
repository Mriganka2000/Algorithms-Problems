import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static int[] maxSlidingWindow(int[] num, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[num.length - k + 1];
        int n = 0;

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && num[i] >= num[deque.getLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
        }

        res[n++] = num[deque.getFirst()];

        for (int i = k; i < num.length; i++) {
            while (!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && num[i] >= num[deque.getLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
            res[n++] = num[deque.getFirst()];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(num, k);

        for (int item : res) {
            System.out.println(item);
        }
    }
}