import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }

        while (k-- > 0) {
            res.add(maxHeap.poll());
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        int[] arr = {12, 5, 787, 1, 23};

        int[] res = kLargest(arr, n, k);

        for (int item : res) {
            System.out.println(item);
        }
    }
}