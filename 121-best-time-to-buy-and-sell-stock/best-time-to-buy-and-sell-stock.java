class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] suffixMax = new int[n];

        // Step 1: build suffix max array
        suffixMax[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(prices[i], suffixMax[i + 1]);
        }

        // Step 2: compute max profit
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            int profit = suffixMax[i + 1] - prices[i];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}