public class List {

    public Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }

        if (x == 1) {
            return head.next;
        }

        Node temp = head, prev = head;
        int n = 1;
        while (temp != null && n != x) {
            prev = temp;
            temp = temp.next;
            n++;
        }

        if (temp != null) {
            prev.next = temp.next;
        }

        return head;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
