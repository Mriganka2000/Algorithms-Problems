public class Main {

    public static int removeDuplicate(int[] arr, int N){
        if (N == 0 || N == 1) {
            return N;
        }

        int n = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[n++] = arr[i];
            }
        }
        arr[n++] = arr[arr.length - 1];

        return n;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = {2, 2, 2, 2, 2};

        System.out.println(removeDuplicate(arr, N));
    }
}