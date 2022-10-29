public class Main {

    public static long toh(int n, int from, int to, int aux) {
        long count = 0;

        if (n != 0) {
            count = toh(n - 1, from, aux, to);
            System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
            count++;
            count += toh(n - 1, aux, to, from);
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(toh(n, 1, 3, 2));
    }
}