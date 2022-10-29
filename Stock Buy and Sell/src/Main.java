public class Main {

    public static int stockBuySell(int[] price, int n) {
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                maxProfit += price[i] - price[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] price = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuySell(price, n));
    }
}