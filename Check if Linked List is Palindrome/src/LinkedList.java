public class LinkedList {

    private Node reverse(Node head) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slowPtr = head;
        Node fastPtr = head;
        Node prev = null;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prev = slowPtr;
            slowPtr = slowPtr.next;
        }

        Node mid = null;
        if (fastPtr != null) {
            mid = slowPtr.next;
        }
        else {
            mid = slowPtr;
        }
        prev.next = null;

        mid = reverse(mid);

        Node temp1 = head;
        Node temp2 = mid;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }
}
