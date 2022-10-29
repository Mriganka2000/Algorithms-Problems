public class List {

    public Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null) {
            Node temp = current;

            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }

            current.next = temp;
            current = current.next;
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
