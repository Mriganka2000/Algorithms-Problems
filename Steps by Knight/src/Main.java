import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static boolean isValid(int x, int y, int N) {
        if (x >= 0 && y >= 0 && x <= N && y <= N) {
            return true;
        }
        return false;
    }

    public static int minStepToReachTarget(int[] knightPos, int[] targetPos, int N) {
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(knightPos[0], knightPos[1], 0));
        boolean[][] visited = new boolean[N + 1][N + 1];
        visited[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty()) {
            Node node = queue.remove();

            if (node.x == targetPos[0] && node.y == targetPos[1]) {
                return node.dist;
            }

            for (int i = 0; i < 8; i++){
                int x = node.x + dx[i];
                int y = node.y + dy[i];

                if (isValid(x, y, N) && !visited[x][y]) {
                    visited[x][y] = true;
                    queue.add(new Node(x, y, node.dist + 1));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N = 30;
        int[] knightPos = { 1, 1 };
        int[] targetPos = { 30, 30 };

        System.out.println(minStepToReachTarget(knightPos, targetPos, N));
    }
}