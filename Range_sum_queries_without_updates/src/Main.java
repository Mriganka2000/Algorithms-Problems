public class Main {

    public static void prefixSum(int[] arr, int[] prefix) {
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
    }

    public static int rangeSum(int[] arr, int start, int end) {
        int[] prefix = new int[arr.length];

        prefixSum(arr, prefix);

        return prefix[end] - prefix[start - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(rangeSum(arr, 1, 3));
        System.out.println(rangeSum(arr, 2, 4));
    }
}