import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static int[] sortArray(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }

        int n = 0;
        while (!queue.isEmpty()) {
            nums[n++] = queue.poll();
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        nums = sortArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}