class Solution {
    public int climbStairs(int n) {
        
        return climb(n, new int[n+1]);
    }
    int climb(int n, int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        
      int f = climb(n-1,dp);
      int s = climb(n-2,dp);
        int ans =f+s;
        dp[n] = ans;
        return ans;
    }
}