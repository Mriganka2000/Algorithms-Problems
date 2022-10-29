import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static int minSwaps(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);

        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || map.get(nums[i]) == i) {
                continue;
            }

            int pos = i;
            int count = 0;

            while (!visited[pos]) {
                visited[pos] = true;
                pos = map.get(nums[pos]);
                count++;
            }

            if (count > 0) {
                ans += (count - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 101, 758, 315, 730, 472, 619, 460, 479 };
        System.out.println(minSwaps(arr));
    }
}