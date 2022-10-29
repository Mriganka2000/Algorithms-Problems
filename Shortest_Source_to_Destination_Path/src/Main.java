import java.util.LinkedList;
import java.util.Queue;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Node {
    public Point point;
    public int distance;

    public Node(Point point, int distance) {
        this.point = point;
        this.distance = distance;
    }
}

class Solution {

    public int rowNum[] = {-1, 0, 0, 1};
    public int colNum[] = {0, -1, 1, 0};

    public boolean isValid(int row, int col, int ROW, int COL) {
        return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL);
    }

    public int shortestDistance(int[][] matrix, int x, int y) {
        Point src = new Point(0, 0);
        Point dist = new Point(x, y);

        if (matrix[src.x][src.y] != 1 || matrix[dist.x][dist.y] != 1) {
            return -1;
        }

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        visited[src.x][src.y] = true;

        Queue<Node> queue = new LinkedList<>();
        Node node = new Node(src, 0);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.peek();
            Point currentPoint = current.point;

            if (currentPoint.x == dist.x && currentPoint.y == dist.y) {
                return current.distance;
            }

            queue.remove();

            for (int i = 0; i < 4; i++) {
                int row = currentPoint.x + rowNum[i];
                int col = currentPoint.y + colNum[i];

                if (isValid(row, col, matrix.length, matrix[0].length) && matrix[row][col] == 1 && !visited[row][col]) {
                    visited[row][col] = true;
                    Node adjacent = new Node(new Point(row, col), current.distance + 1);
                    queue.add(adjacent);
                }
            }
        }

        return -1;
    }
}

public class Main {

    public static void main(String[] args) {
        int mat[][] = {{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};

        Solution solution = new Solution();

        int distance = solution.shortestDistance(mat, 3, 4);

        System.out.println(distance);
    }
}