public class Main {

    public static String removeUtil(String str) {
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
            }
            else {
                ans.append(str.charAt(i));
            }
            i++;
        }

        return ans.toString();
    }

    public static String remove(String str) {
        String modified = "";

        while (str.length() != modified.length()) {
            modified = str;
            str = removeUtil(str);
        }

        return str;
    }

    public static void main(String[] args) {
        String str1 = "geeksforgeek";
        String str2 = "abccbccba";
        System.out.println(remove(str1));
        System.out.println(remove(str2));
    }
}