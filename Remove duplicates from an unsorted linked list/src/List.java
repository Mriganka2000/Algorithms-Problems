import java.util.HashSet;

public class List {

    public Node removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = head;

        while (current != null) {
            int val = current.data;
            if (set.contains(val)) {
                prev.next = current.next;
            }
            else {
                set.add(val);
                prev = current;
            }
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
