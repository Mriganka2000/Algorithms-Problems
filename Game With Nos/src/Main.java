public class Main {

    public static int[] gameWithNumber (int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            int n1 = arr[i];
            int n2 = arr[i + 1];
            arr[i] = n1 ^ n2;
        }

        return arr;
    }

    public static void main(String[] args) {
        int n=5;
        int[] arr = {10, 11, 1, 2, 3};
        int[] res = gameWithNumber(arr, n);

        for (int item : res) {
            System.out.println(item);
        }
    }
}