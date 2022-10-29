import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return new LinkedList<>();
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                temp.add(node.val);

                for (Node item : node.children) {
                    queue.offer(item);
                }
            }

            list.add(temp);
        }

        return list;
    }

    public static void printList(List<List<Integer> > temp) {
        for (List<Integer> it : temp) {
            for (Integer et : it) {
                System.out.print(et + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        (root.children).add(new Node(3));
        (root.children).add(new Node(2));
        (root.children).add(new Node(4));
        (root.children.get(0).children).add(new Node(5));
        (root.children.get(0).children).add(new Node(6));
        List<List<Integer> > ans = levelOrder(root);
        printList(ans);
    }
}