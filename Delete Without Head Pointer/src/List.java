public class List {

    public void deleteNode(Node del) {
        if (del == null) {
            return;
        }
        else {
            if (del.next == null) {
                return;
            }
            else {
                Node temp = del.next;
                del.data = del.next.data;
                del.next = del.next.next;
            }
        }
    }

    public void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
