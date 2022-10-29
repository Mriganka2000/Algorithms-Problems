public class Main {

    public static int maxCoins(int[] nums) {
        int[][] table = new int[nums.length][nums.length];

        for (int len = 1; len <= nums.length; len++) {
            for (int i = 0; i <= nums.length - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    int leftValue = 1;
                    int rightValue = 1;

                    if (i != 0) {
                        leftValue = nums[i - 1];
                    }
                    if (j != nums.length - 1) {
                        rightValue = nums[j + 1];
                    }

                    int before = 0;
                    int after = 0;

                    if (i != k) {
                        before = table[i][k - 1];
                    }
                    if (j != k) {
                        after = table[k + 1][j];
                    }

                    table[i][j] = Math.max((leftValue * nums[k] * rightValue + before + after), table[i][j]);
                }
            }
        }
        
        return table[0][nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        System.out.println(maxCoins(nums));
    }
}