public class Main {

    public static int missingNumber(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            int pos = arr[i] - 1;
            while (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[pos]) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos = arr[i] - 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) != arr[i]) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(missingNumber(arr, arr.length));
    }
}