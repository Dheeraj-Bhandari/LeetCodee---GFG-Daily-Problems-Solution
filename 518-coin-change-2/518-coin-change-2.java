class Solution {
    public int change(int amount, int[] coins) {
         
        int n =coins.length;
        int price = amount;
        
        
        int [] dp = new int [price+1];
        dp[0] = 1;
        for(int i=0; i<coins.length; i++){
            for(int j=coins[i]; j<dp.length; j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        
        return(dp[price]);
    }
}