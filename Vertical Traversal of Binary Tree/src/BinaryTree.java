import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class BinaryTree {

    private void getVerticalOrder(Node root, int horizontalDistance, TreeMap<Integer, Vector<Integer>> map) {
        if (root == null) {
            return;
        }

        Vector<Integer> get = map.get(horizontalDistance);
        if (get == null) {
            get = new Vector<>();
            get.add(root.data);
        }
        else {
            get.add(root.data);
        }

        map.put(horizontalDistance, get);

        getVerticalOrder(root.left, horizontalDistance - 1, map);
        getVerticalOrder(root.right, horizontalDistance + 1, map);
    }

    public ArrayList<Integer> verticalOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
        int horizontalDistance = 0;
        getVerticalOrder(root, horizontalDistance, map);

        for (Map.Entry<Integer, Vector<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            for (int item : entry.getValue()) {
                list.add(item);
            }
        }

        return list;
    }
}
