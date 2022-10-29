import java.util.Stack;

public class Main {

    public static int[] calculateSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[price.length];

        res[0] = 1;
        stack.push(0);

        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = i + 1;
            }
            else {
                res[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] price = { 10, 4, 5, 90, 120, 80 };
        int[] result = calculateSpan(price);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}