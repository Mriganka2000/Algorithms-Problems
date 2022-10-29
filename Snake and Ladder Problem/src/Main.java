import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int[] findCoordinates(int curr, int n) {
        int r = n - (curr - 1) / n  -1;
        int c = (curr - 1) % n;
        if (r % 2 == n % 2) {
            return new int[]{r, n - 1 - c};
        } else {
            return new int[]{r, c};
        }
    }

    public static int snakeAndLadder(int[][] board) {
        int steps = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        queue.add(1);
        visited[board.length - 1][0] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int x = queue.poll();

                if (x == board.length * board[0].length) {
                    return steps;
                }

                for (int j = 1; j <= 6; j++) {
                    if (j + x > (board.length * board[0].length)) {
                        break;
                    }
                    int[] pos = findCoordinates(j + x, board.length);
                    int row = pos[0];
                    int col = pos[1];
                    if (visited[row][col]) {
                        continue;
                    }
                    visited[row][col] = true;
                    if (board[row][col] == -1) {
                        queue.add(j + x);
                    }
                    else {
                        queue.add(board[row][col]);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] board = {
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,35,-1,-1,13,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,15,-1,-1,-1,-1}
        };
        System.out.println(snakeAndLadder(board));
    }
}