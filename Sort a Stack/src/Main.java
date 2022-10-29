import java.util.Stack;

public class Main {

    public static void insert(Stack<Integer> stack, int val) {
        if (stack.isEmpty() || val > stack.peek()) {
            stack.push(val);
            return;
        }

        int temp = stack.pop();
        insert(stack, val);

        stack.push(temp);
    }

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sortStack(stack);
            insert(stack, x);
        }
    }

    public static Stack<Integer> sort(Stack<Integer> stack) {
        sortStack(stack);
        return stack;
    }

    public static void print(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(4);
        stack.add(1);
        stack.add(5);
        stack.add(3);
        print(sort(stack));
    }
}