public class Main {

    public static int countDivisibles(int a, int b, int m){
        if (a % m == 0) {
            return (b / m) - (a / m) + 1;
        }

        return (b / m) - (a / m);
    }

    public static void main(String[] args) {
        int a = 30, b = 100, m = 30;
        System.out.println(countDivisibles(a, b, m));
    }
}