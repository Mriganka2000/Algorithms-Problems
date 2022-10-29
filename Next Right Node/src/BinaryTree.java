import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public Node nextRight(Node root, int key) {
        if (root == null) {
            return null;
        }

        int level = 0;
        Queue<Node> nodes = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();

        nodes.add(root);
        levels.add(level);

        while (!nodes.isEmpty()) {
            Node node = nodes.peek();
            level = levels.peek();
            nodes.remove();
            levels.remove();

            if (node.data == key) {
                if (levels.size() == 0 || levels.peek() != level) {
                    return new Node(-1);
                }
                return nodes.peek();
            }

            if (node.left != null) {
                nodes.add(node.left);
                levels.add(level + 1);
            }
            if (node.right != null) {
                nodes.add(node.right);
                levels.add(level + 1);
            }
        }

        return new Node(-1);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
