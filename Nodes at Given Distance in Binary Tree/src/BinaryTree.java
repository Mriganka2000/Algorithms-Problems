import java.util.ArrayList;

public class BinaryTree {

    public void printSubTreeNodes(Node root, int k, ArrayList<Integer> list) {
        if (root == null || k < 0) {
            return;
        }
        if (k == 0) {
            list.add(root.data);
            return;
        }

        printSubTreeNodes(root.left, k - 1, list);
        printSubTreeNodes(root.right, k - 1, list);
    }

    public int printNodesAtK(Node root, int target, int k, ArrayList<Integer> list) {
        if (root == null) {
            return -1;
        }
        if (root.data == target) {
            printSubTreeNodes(root, k, list);
            return 0;
        }

        int distLeft = printNodesAtK(root.left, target, k, list);
        if (distLeft != -1) {
            if (distLeft + 1 == k) {
                list.add(root.data);
            }
            else {
                printSubTreeNodes(root.right, k - distLeft - 2, list);
            }
            return distLeft + 1;
        }

        int distRight = printNodesAtK(root.right, target, k, list);
        if (distRight != -1) {
            if (distRight + 1 == k) {
                list.add(root.data);
            }
            else {
                printSubTreeNodes(root.left, k - distRight - 2, list);
            }
            return distRight + 1;
        }

        return -1;
    }

    public ArrayList<Integer> KDistanceNodes(Node root, int target , int k) {
        ArrayList<Integer> list = new ArrayList<>();
        printNodesAtK(root, target, k, list);
        return list;
    }
}
