class Solution {
    public int combinationSum4(int[] coins, int amount) {
    int[] dp = new int[amount+1];
        // Arrays.fill(dp, Integer.MIN_VALUE);
        
        dp[0] = 1;
        for(int i =1; i<dp.length; i++){
           for(int j=0; j<coins.length; j++){
                if(coins[j]<=i ){
                    dp[i]+= dp[i-coins[j]];
                }
            }
        }
        
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}