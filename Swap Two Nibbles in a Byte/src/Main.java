public class Main {

    public static int swapNibbles(int N) {
        return ((N & 0x0F) << 4 | (N & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(swapNibbles(n));
    }
}