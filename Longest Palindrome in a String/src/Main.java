public class Main {

//    Longest Palindromic Substring
    public static String longestPalindrome(String str){
        if (str.length() < 2) {
            return str;
        }

        int maxLength = 1, start = 0;

        for (int i = 0; i < str.length(); i++) {
            int low = i - 1;
            int high = i + 1;

            while (high < str.length() && str.charAt(high) == str.charAt(i)) {
                high++;
            }
            while (low >= 0 && str.charAt(low) == str.charAt(i)) {
                low--;
            }
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length) {
                maxLength = length;
                start = low + 1;
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println(longestPalindrome(str));
    }
}