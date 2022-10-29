public class Main {

    public static void immediateSmaller(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            }
            else {
                arr[i] = -1;
            }
        }

        arr[arr.length - 1] = -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        immediateSmaller(arr, arr.length);

        for (int item : arr) {
            System.out.println(item);
        }
    }
}