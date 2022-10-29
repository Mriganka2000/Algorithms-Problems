import java.util.Arrays;

public class Main
{
    public static boolean findTriplets(int[] arr, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == 0) {
                    left++;
                    right--;
                    return true;
                }
                else if (arr[i] + arr[left] + arr[right] < 0) {
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
        int[] arr = { 0, -1, 2, -3, 1 };
        System.out.println(findTriplets(arr, arr.length));
    }
}

