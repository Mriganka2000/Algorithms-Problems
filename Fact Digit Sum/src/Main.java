import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList<Integer> factDigit(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] fact = new int[10];
        fact[0] = 1;

        for (int i = 1; i < 10; i++) {
            fact[i] = i * fact[i - 1];
        }

        for (int i = 9; i > 0; i--) {
            while (n >= fact[i]) {
                n = n - fact[i];
                res.add(i);
            }
        }

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int n = 40321;
        System.out.println(factDigit(n));
    }
}