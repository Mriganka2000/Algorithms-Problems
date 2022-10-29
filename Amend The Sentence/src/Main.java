public class Main {

    public static String amendSentence(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
            if (Character.isUpperCase(str.charAt(i + 1))) {
                sb.append(' ');
            }
        }

        if (Character.isUpperCase(str.charAt(str.length() - 1))) {
            sb.append(Character.toLowerCase(str.charAt(str.length() - 1)));
        }
        else {
            sb.append(str.charAt(str.length() - 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "BruceWayneIsBatman";
        System.out.println(amendSentence(s));
    }
}