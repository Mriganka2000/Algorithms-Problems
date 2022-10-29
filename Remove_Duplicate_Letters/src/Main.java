import java.util.Stack;

public class Main {

    public static String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] hasSeen = new boolean[26];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (hasSeen[c]) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && i < lastIndex[stack.peek()]) {
                hasSeen[stack.pop()] = false;
            }
            stack.push(c);
            hasSeen[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = (char)(stack.pop() + 'a');
            sb.append(c);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
        System.out.println(removeDuplicateLetters("bcabc"));
    }
}