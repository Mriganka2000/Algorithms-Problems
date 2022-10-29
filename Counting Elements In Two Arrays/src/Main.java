import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Integer> countEleLessThanOrEqual(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            int start = 0, end = arr2.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr2[mid] <= arr1[i]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            result.add(end + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int m = 6, n = 6;
        int[] arr1 = {1,2,3,4,7,9};
        int[] arr2 = {0,1,2,1,1,4};

        System.out.println(countEleLessThanOrEqual(arr1, arr2, m, n));
    }
}