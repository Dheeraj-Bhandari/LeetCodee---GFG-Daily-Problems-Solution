class Solution {
    public int maxProfit(int[] prices) {
    
        int n =prices.length;
        int maxRight = prices[n-1];
        int profit = 0;
        for(int i=n-2; i>=0; i--){
            
            maxRight = Math.max(prices[i], maxRight);
            profit = Math.max(profit,maxRight-prices[i] );
        } 
        return profit;
    }
}