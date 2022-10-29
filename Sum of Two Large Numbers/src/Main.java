public class Main {

    public static String findSum(String str1, String str2) {
        if (str1.length() > str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        String str = "";

        int carry = 0;
        for (int i = 0; i < str1.length(); i++) {
            int sum = (int)(str1.charAt(i) - '0') + (int)(str2.charAt(i) - '0') + carry;
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        for (int i = str1.length(); i < str2.length(); i++) {
            int sum = (int)(str2.charAt(i) - '0') + carry;
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0) {
            str += (char)(carry + '0');
        }

        str = new StringBuilder(str).reverse().toString();

        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                flag++;
            }
            else {
                break;
            }
        }

        if (flag == str.length()) {
            return "0";
        }
        else {
            String res = str.substring(flag);
            return res;
        }
    }

    public static void main(String[] args) {
        String str1 = "0000000";
        String str2 = "00000000";
        System.out.println(findSum(str1, str2));
    }
}