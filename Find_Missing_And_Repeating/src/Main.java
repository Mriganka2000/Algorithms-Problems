import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] findTwoElement(int[] arr, int n) {
        Map<Integer, Boolean> numberMap = new HashMap<>();
        int repeating = 0, missing = 0;

        int max = arr.length;

        for (Integer i : arr) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                repeating = i;
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                missing = i;
            }
        }

        return new int[] {repeating, missing};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 6};
        int[] res = findTwoElement(arr, arr.length);
        System.out.println("Missing :- " + res[0] + " Repeating :- " + res[1]);
    }
}