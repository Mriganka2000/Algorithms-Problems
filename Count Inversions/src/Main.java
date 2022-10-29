import java.util.Arrays;

public class Main {

    public static long merge(long[] arr, int start, int mid, int end) {
        int i = start, n = start, j = mid + 1;
        long count = 0;
        long[] temp = new long[arr.length];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[n++] = arr[i++];
            }
            else {
                temp[n++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[n++] = arr[i++];
        }
        while (j <= end) {
            temp[n++] = arr[j++];
        }

        for (int k = start; k <= end; k++) {
            arr[k] = temp[k];
        }

        return count;
//        long[] left = Arrays.copyOfRange(arr, start, mid + 1);
//
//        // Right subarray
//        long[] right = Arrays.copyOfRange(arr, mid + 1, end + 1);
//
//        int i = 0, j = 0, k = start;
//        long swaps = 0;
//
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j])
//                arr[k++] = left[i++];
//            else {
//                arr[k++] = right[j++];
//                swaps += (mid + 1) - (start + i);
//            }
//        }
//        while (i < left.length)
//            arr[k++] = left[i++];
//        while (j < right.length)
//            arr[k++] = right[j++];
//        return swaps;
    }

    public static long mergeSort(long[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }
        long count = 0;
        int mid = (start + end) / 2;
        count += mergeSort(arr, start, mid);
        count += mergeSort(arr, mid + 1, end);
        count += merge(arr, start, mid, end);

        return count;
    }

    public static long inversionCount(long[] arr, long n) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        long[] arr = { 1, 9, 6, 4, 5 };
        System.out.println(inversionCount(arr, arr.length));
    }
}