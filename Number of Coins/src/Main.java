public class Main {

    public static int minCoins(int[] coins, int n, int total) {
        int[] table = new int[total + 1];
        table[0] = 0;
        for (int i = 1; i < table.length; i++) {
            table[i] = Integer.MAX_VALUE - 1;
        }

        for(int j = 0; j < coins.length; j++){
            for(int i = 1; i <= total; i++){
                if(i >= coins[j]){
                    if (table[i - coins[j]] + 1 < table[i]) {
                        table[i] = table[i - coins[j]] + 1;
                    }
                }
            }
        }

        return table[total] == Integer.MAX_VALUE - 1 ? -1 : table[total];
    }

    public static void main(String[] args) {
        int V = 30;
        int M = 3;
        int[] coins = {25, 10, 5};
        System.out.println(minCoins(coins, M, V));
    }
}