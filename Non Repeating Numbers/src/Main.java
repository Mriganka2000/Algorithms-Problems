public class Main {

    public static int[] singleNumber(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }

        sum = sum & -sum;

        int miss1 = 0;
        int miss2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & sum) > 0) {
                miss1 = miss1 ^ nums[i];
            }
            else {
                miss2 = miss2 ^ nums[i];
            }
        }

        if (miss1 > miss2) {
            return new int[] {miss2, miss1};
        }
        else {
            return new int[] {miss1, miss2};
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2};
        int[] res = singleNumber(arr);
        System.out.println("Missing numbers are :- " + res[0] + ", " + res[1]);
    }
}