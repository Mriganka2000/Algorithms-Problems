import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] slots = new int[n];

        for (int i = 0; i < n; i++) {
            slots[i] = scanner.nextInt();
        }

        Arrays.sort(slots);

        int low = 0, high = slots[slots.length - 1], mid = 0, best = 0;

        while (low <= high) {
            mid = (low + high + 1) / 2;
            int count = 1, left = 0;
            for (int i = 1; i < slots.length && count < c; i++) {
                if (slots[i] - slots[left] >= mid) {
                    left = i;
                    count++;
                }
            }
            if (count >= c) {
                best = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println(best);
    }
}