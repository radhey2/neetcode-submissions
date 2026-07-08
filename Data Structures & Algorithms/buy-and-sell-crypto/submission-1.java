class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int minPrices = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (minPrices > prices[i]) {
                minPrices = prices[i];
            }
            profit = Math.max(profit,prices[i] - minPrices);
        }

        return profit;
    }
}
