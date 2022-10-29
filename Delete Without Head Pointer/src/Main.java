public class Main {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(4);
        head.next.next.next = new Node(30);

        List list = new List();
        list.deleteNode(head.next);

        list.print(head);
    }
}