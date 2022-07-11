package leetCode;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(MaxProfit.maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0; //[7,1,5,3,6,4]
        for (int i = 1; i < prices.length; i++) { //[1,5,3,6,4]
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - profit, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
}
