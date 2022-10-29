import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int multiply(int x, int[] result, int size) {
        int carry = 0;

        for (int i = 0; i < size; i++) {
            int prod = result[i] * x + carry;
            result[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            result[size] = carry % 10;
            carry = carry / 10;
            size++;
        }

        return size;
    }

    public static ArrayList<Integer> factorial(int n){
        int[] result = new int[1000000];
        result[0] = 1;
        int size = 1;

        for (int i = 2; i <= n; i++) {
            size = multiply(i, result, size);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            res.add(result[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> result = factorial(n);

        for (int item : result) {
            System.out.print(item);
        }
    }
}