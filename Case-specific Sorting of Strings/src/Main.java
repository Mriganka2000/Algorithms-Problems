import java.util.Vector;
import java.util.Collections;

public class Main {

    public static String caseSort(String str) {
        Vector<Character> lowerCase = new Vector<>();
        Vector<Character> upperCase = new Vector<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase.add(str.charAt(i));
            }
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCase.add(str.charAt(i));
            }
        }

        Collections.sort(lowerCase);
        Collections.sort(upperCase);

        StringBuilder sb = new StringBuilder(str);
        int m = 0, n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                sb.setCharAt(i, lowerCase.get(m++));
            }
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                sb.setCharAt(i, upperCase.get(n++));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "defRTSersUXI";
        System.out.println(caseSort(str));
    }
}