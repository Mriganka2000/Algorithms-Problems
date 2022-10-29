public class Main {

    public static int majorityElement(int[] arr, int size) {
        int major = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (major == arr[i]) {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                count = 1;
                major = arr[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == major) {
                counter++;
            }
        }

        if (counter > arr.length / 2) {
            return major;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = {3,1,3,3,2};
        System.out.println(majorityElement(arr, N));
    }
}