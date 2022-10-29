public class Main {

    public static String ReFormatString(String str, int k){
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '-') {
                temp += Character.toUpperCase(str.charAt(i));
            }
        }

        String ans = "";
        int val = k;

        for (int i = temp.length() - 1; i >= 0; i--) {
            if (val == 0) {
                ans += "-";
                val = k;
            }
            ans += temp.charAt(i);
            val--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = ans.length() - 1; i >= 0; i--) {
            sb.append(ans.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "2-5g-3-J";
        System.out.println(ReFormatString(str, 2));
    }
}