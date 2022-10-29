public class List {

    private int length(Node head) {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }

    public int getNthFromLast(Node head, int n) {
        int len = length(head);

        if (len < n) {
            return -1;
        }

        int pos = len - n;
        Node temp = head;

        while (temp != null && pos-- > 0) {
            temp = temp.next;
        }

        return temp.data;
    }
}
