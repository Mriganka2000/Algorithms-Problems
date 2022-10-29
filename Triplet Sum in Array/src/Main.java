import java.util.Arrays;

public class Main {

    public static boolean find3Numbers(int[] arr, int n, int x) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == x) {
                    return true;
                }
                else if (arr[i] + arr[left] + arr[right] < x) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 6, x = 13;
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(find3Numbers(arr, n, x));
    }
}