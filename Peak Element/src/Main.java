public class Main {

    public static int peakElement(int[] arr, int n) {
        int start = 0, end = arr.length - 1, mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                break;
            }
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        System.out.println(peakElement(arr, n));
    }
}