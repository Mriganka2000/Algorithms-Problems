public class Main {

    public static int[] polyMultiply(int[] arr1, int[] arr2, int m, int n) {
        int[] product = new int[m + n - 1];

        for (int i = 0; i < product.length; i++) {
            product[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                product[i + j] += arr1[i] * arr2[j];
            }
        }

        return product;
    }

    public static void main(String[] args) {
        int M = 4, N = 3;
        int[] Arr1 = {1, 0, 3, 2};
        int[] Arr2 = {2, 0, 4};
        int[] res = polyMultiply(Arr1, Arr2, M, N);

        for (int item : res) {
            System.out.println(item);
        }
    }
}