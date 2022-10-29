import java.util.ArrayList;

public class Main {

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i+=k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5, k = 3;
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : arr) {
            list.add(item);
        }
        reverseInGroups(list, n, k);
        System.out.println(list);
    }
}