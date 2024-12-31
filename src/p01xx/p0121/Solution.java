package p01xx.p0121;

// 제목 : Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;

        if (length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int maxSellPrice = prices[length - 1];

        for (int i = prices.length - 2; i >= 0; i--) {
            int price = prices[i];
            maxProfit = Math.max(maxProfit, maxSellPrice - price);
            maxSellPrice = Math.max(maxSellPrice, price);
        }

        return maxProfit;
    }
}
