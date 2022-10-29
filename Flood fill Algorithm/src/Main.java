public class Main
{
    public static void floodFillUtil(int[][] image, int sr, int sc, int newColor, int prev) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] != prev) {
            return;
        }

        image[sr][sc] = newColor;

        floodFillUtil(image, sr + 1, sc, newColor, prev);
        floodFillUtil(image, sr - 1, sc, newColor, prev);
        floodFillUtil(image, sr, sc + 1, newColor, prev);
        floodFillUtil(image, sr, sc - 1, newColor, prev);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int prev = image[sr][sc];

        if (prev == newColor) {
            return image;
        }

        floodFillUtil(image, sr, sc, newColor, prev);

        return image;
    }

    public static void main(String[] args) {
        int screen[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int x = 4, y = 4, newC = 3;
        screen = floodFill(screen, x, y, newC);

        for (int  i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[0].length; j++) {
                System.out.print(screen[i][j] + " ");
            }
            System.out.println();
        }
    }
}

