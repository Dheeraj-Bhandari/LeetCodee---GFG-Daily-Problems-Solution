class Solution {
    public int maxProfit(int k, int[] prices) {
        int n =prices.length;
        
        int left = 0 , right = Integer.MAX_VALUE/2;
        while (left<right)
        {
            int fee = left + (right-left)/2;
            if (helper(prices, fee)[1] > k)
                left = fee+1;
            else
                right = fee;
        }
        return helper(prices,left)[0] + left*k;
    }
    int[] helper(int[] prices, int fee){
        int n =prices.length;
        int[] sold = new int[n+1];
        int[] hold = new int[n+1];
        hold[0] = Integer.MIN_VALUE;
        int count0 = 0 ;
        int count1 =0;
        for(int i = 1;i<=n;i++){
            if(hold[i-1]+prices[i-1] > sold[i-1]){
                sold[i] = hold[i-1] + prices[i-1];
                count0 = count1+1;
            }
            else sold[i] = sold[i-1];
            if (sold[i-1] - prices[i-1] - fee  > hold[i-1])
            {
                hold[i] = sold[i-1] - prices[i-1] - fee;
                count1 = count0;
            }
            else
                hold[i] = hold[i-1];
        }
        return new int[]{sold[n], count0};
    }
}