import java.util.Arrays;

public class Main {

    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int result = arr[arr.length - 1] - arr[0];
        int max = arr[arr.length - 1];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[i - 1] + k, arr[arr.length - 1] - k);

            result = Math.min(result, max - min);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        System.out.println(getMinDiff(arr, arr.length, k));
    }
}