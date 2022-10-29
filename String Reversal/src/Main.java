import java.util.LinkedHashSet;

public class Main {

    public static String reverseString(String str) {

        char[] arr = str.replaceAll(" ", "").toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        str = "";
        for (char item : set) {
            str += item;
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("GEEKS FOR GEEKS"));
    }
}