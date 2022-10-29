import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public boolean isCompleteBT(Node root) {
        if (root == null) {
            return true;
        }

        boolean full = false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();

            if (temp.left != null) {
                if (full == true) {
                    return false;
                }
                queue.add(temp.left);
            }
            else {
                full = true;
            }

            if (temp.right != null) {
                if (full == true) {
                    return false;
                }
                queue.add(temp.right);
            }
            else {
                full = true;
            }
        }

        return true;
    }
}
