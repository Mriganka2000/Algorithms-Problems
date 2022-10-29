import java.util.Stack;

public class Main {

    public static int getMaxArea(int[] hist) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        int i = 0;

        while (i < hist.length) {
            if (stack.empty() || hist[stack.peek()] <= hist[i]) {
                stack.push(i++);
            }
            else {
                int top = stack.pop();
                int currentArea = hist[top] * (stack.empty() ? i : i - stack.peek() - 1);

                if (area < currentArea) {
                    area = currentArea;
                }
            }
        }

        while (!stack.empty()) {
            int top = stack.pop();
            int currentArea = hist[top] * (stack.empty() ? i : i - stack.peek() - 1);

            if (area < currentArea) {
                area = currentArea;
            }
        }

        return area;
   }

    public static void main(String[] args) {
        int[] hist = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println(getMaxArea(hist));
    }
}