public class Main {
    public static int findMin(int[] arr, int n) {
        int start = 0, end = n - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == arr[end]) {
                end--;
            }
            else if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return arr[end];
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(findMin(arr, N));
    }
}