public class List {

    public Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }

        return head;
    }

    public Node reverse(Node head) {
        Node current = head, prev = null;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

        return head;
    }

    public Node sortedMerge(Node head1, Node head2) {
        Node head = null;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                head = insert(head, temp1.data);
                temp1 = temp1.next;
            }
            else {
                head = insert(head, temp2.data);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            head = insert(head, temp1.data);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            head = insert(head, temp2.data);
            temp2 = temp2.next;
        }

        head = reverse(head);

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
