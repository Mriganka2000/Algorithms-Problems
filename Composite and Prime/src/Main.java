public class Main {

    public static int count(int L, int R)
    {
        int prime = 0;
        int composite = 0;

        if (L == 1) {
            composite++;
        }

        for (int i = L; i <= R; i++) {
            int temp = i;
            boolean flag = true;
            for (int j = 2; j * j <= temp; j++) {
                if (temp % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                prime++;
            }
            else {
                composite++;
            }
        }

        return composite - prime;
    }
    public static void main(String[] args) {
        int L = 4, R = 4;
        System.out.println(count(L, R));
    }
}