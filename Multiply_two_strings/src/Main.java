public class Main {

    public static String  multiplyStrings(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return "0";
        }

        String temp1 = str1;
        String temp2 = str2;

        if (str1.charAt(0) == '-') {
            str1 = str1.substring(1);
        }
        if (str2.charAt(0) == '-') {
            str2 = str2.substring(1);
        }

        int[] result = new int[str1.length() + str2.length()];
        int n1 = 0;
        int n2 = 0;

        for (int i = str1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int num1 = str1.charAt(i) - '0';
            n2 = 0;

            for (int j = str2.length() - 1; j >= 0; j--) {
                int num2 = str2.charAt(j) - '0';
                int sum = num1 * num2 + result[n1 + n2] + carry;
                carry = sum / 10;
                result[n1 + n2] = sum % 10;
                n2++;
            }

            if (carry > 0) {
                result[n1 + n2] += carry;
            }

            n1++;
        }

        int n = result.length - 1;
        while (n >= 0 && result[n] == 0) {
            n--;
        }

        if (n < 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        if (temp1.charAt(0) != '-' && temp2.charAt(0) == '-') {
            sb.append('-');
        }
        else if (temp1.charAt(0) == '-' && temp2.charAt(0) != '-') {
            sb.append('-');
        }

        while (n >= 0) {
            sb.append(result[n--]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "-12";
        String str2 = "12";
        System.out.println(multiplyStrings(str1, str2));
    }
}