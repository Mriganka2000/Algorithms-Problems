public class Stack {

    public StackNode top;

    public void push(int a) {
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;
    }

    public int pop() {
        StackNode temp = top;
        if (top == null) {
            return -1;
        }
        top = top.next;
        return temp.data;
    }
}
