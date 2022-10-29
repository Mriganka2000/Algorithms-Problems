public class Stacks {

    //Function to push an integer into the stack1.
    public void push1(int x, TwoStack sq) {
        if (sq.top1 < sq.top2 - 1) {
            sq.arr[++sq.top1] = x;
        }
        else {
            return;
        }
    }

    //Function to push an integer into the stack2.
    public void push2(int x, TwoStack sq) {
        if (sq.top1 < sq.top2 - 1) {
            sq.arr[--sq.top2] = x;
        }
        else {
            return;
        }
    }

    //Function to remove an element from top of the stack1.
    public int pop1(TwoStack sq) {
        if (sq.top1 >= 0) {
            return sq.arr[sq.top1--];
        }
        return -1;
    }

    //Function to remove an element from top of the stack2.
    public int pop2(TwoStack sq) {
        if (sq.top2 < sq.size) {
            return sq.arr[sq.top2++];
        }
        return -1;
    }
}
