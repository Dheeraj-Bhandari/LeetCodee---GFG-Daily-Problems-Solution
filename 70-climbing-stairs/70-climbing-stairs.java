class Solution {
    public int climbStairs(int n) {
        
        // return usingMemoization(n, new int[n+1]);
        return UsingTabulation(n, new int [n+1]);
    }
    int usingMemoization(int n, int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        
      int f = usingMemoization(n-1,dp);
      int s = usingMemoization(n-2,dp);
        int ans =f+s;
        dp[n] = ans;
        return ans;
    }
    int UsingTabulation(int n, int[] dp){
        
        dp[0]=1;
        for(int i=1; i<=n; i++){
            if(i==1){
             dp[i] = dp[i-1];  
            }
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}