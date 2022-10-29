import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private Node head = new Node();
    private Node tail = new Node();
    private Map<Integer, Node> nodeMap;
    private int capacity;

    public LRUCache(int capacity) {
        this.nodeMap = new HashMap<>(capacity);
        this.capacity = capacity;
        this.head.next = tail;
        this.tail.prev = head;
    }

    //Function to return value corresponding to the key.
    public int get(int key) {
        int result = -1;
        Node node = nodeMap.get(key);

        if (node != null) {
            result = node.val;
            remove(node);
            add(node);
        }

        return result;
    }

    //Function for storing key-value pair.
    public void set(int key, int value) {
        Node node = nodeMap.get(key);

        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        }
        else {
            if (nodeMap.size() == capacity) {
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;

            nodeMap.put(key, newNode);
            add(newNode);
        }
    }

    public void add(Node node) {
        Node headNext = head.next;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node) {
        Node nextNode = node.next;
        Node prevNode = node.prev;

        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }
}
