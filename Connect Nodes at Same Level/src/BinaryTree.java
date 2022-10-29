import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public void connect(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        Node temp = null;
        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                Node prev = temp;
                temp = queue.poll();

                if (i > 0) {
                    prev.nextRight = temp;
                }

                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            temp.nextRight = null;
        }
    }
}
