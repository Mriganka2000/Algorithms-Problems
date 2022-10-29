import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int i;
    public int j;

    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public boolean isPossible(int[][] grid) {
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new Node(i, j));
                    break;
                }
            }
        }

        while (!queue.isEmpty()) {
            Node node = queue.peek();
            queue.remove();

            int i = node.i;
            int j = node.j;

            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
                continue;
            }

            if (grid[i][j] == 0) {
                continue;
            }

            if (grid[i][j] == 2) {
                return true;
            }

            grid[i][j] = 0;

            queue.add(new Node(i, j + 1));
            queue.add(new Node(i, j - 1));
            queue.add(new Node(i + 1, j));
            queue.add(new Node(i - 1, j));
        }

        return false;
    }
}

public class Main {

    public static void main(String[] args) {
        int matrix[][] = { { 0, 3, 0, 1 },
                { 3, 0, 3, 3 },
                { 2, 3, 3, 3 },
                { 0, 3, 3, 3 }
        };

        Solution solution = new Solution();

        if (solution.isPossible(matrix) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}