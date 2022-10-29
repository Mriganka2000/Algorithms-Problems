import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[n];

        for (List<Integer> edge : edges) {
            arr[edge.get(1)]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        list1.add(0);
        list1.add(1);
        list.add(list1);
        List<Integer> list2 = new LinkedList<>();
        list2.add(0);
        list2.add(2);
        list.add(list2);
        List<Integer> list3 = new LinkedList<>();
        list3.add(2);
        list3.add(5);
        list.add(list3);
        List<Integer> list4 = new LinkedList<>();
        list4.add(3);
        list4.add(4);
        list.add(list4);
        List<Integer> list5 = new LinkedList<>();
        list5.add(4);
        list5.add(2);
        list.add(list5);

        System.out.println(findSmallestSetOfVertices(n, list));
    }
}