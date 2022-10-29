import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static String swap(String str, int a, int b) {
        char[] arr = str.toCharArray();

        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return String.valueOf(arr);
    }

    private static void findPermutation(String str, List<String> list, int left, int right) {
        if (left == right) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                findPermutation(str, list, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static List<String> findPermutation(String str) {
        List<String> list = new ArrayList<>();
        findPermutation(str, list, 0, str.length() - 1);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        String str = "ABC";
        List<String> list = findPermutation(str);

        for (String item : list) {
            System.out.println(item);
        }
    }
}