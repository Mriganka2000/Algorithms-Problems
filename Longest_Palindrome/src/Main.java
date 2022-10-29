public class Main {

    public static int longestPalindrome(String s) {
        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int res = 0;
        for (int val : arr) {
            res += val / 2 * 2;
            if (res % 2 == 0 && val % 2 == 1) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
    }
}