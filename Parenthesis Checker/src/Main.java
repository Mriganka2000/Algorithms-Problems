import java.util.Stack;

public class Main {

    public static boolean parenthesisChecker(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            switch (c) {
                case ')': {
                    char check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                }
                case '}': {
                    char check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                }
                case ']': {
                    char check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{([])}";
        System.out.println(parenthesisChecker(str));
    }
}