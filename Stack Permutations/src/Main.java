import java.util.Stack;

public class Main {

    public static int isStackPermutation(int n, int[] ip, int[] op) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i < ip.length; i++) {
            stack.push(ip[i]);

            while (!stack.isEmpty() && stack.peek() == op[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] input = { 4, 5, 6, 7, 8 };
        int[] output = { 8, 7, 6, 5, 4 };
        int n = 5;
        System.out.println(isStackPermutation(n, input, output));
    }
}