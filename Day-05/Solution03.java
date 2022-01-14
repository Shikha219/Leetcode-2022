/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++)
        {
        int curPrice = prices[i];
        maxProfit = Math.max(maxProfit, curPrice-minPrice);
        minPrice = Math.min(minPrice, curPrice);
        }
        return maxProfit;
    }
}
