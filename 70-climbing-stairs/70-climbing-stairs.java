class Solution {
    
    public int climbStairs(int n) {
      int [] dp = new int[n+1];
        return climbStairs2(n, dp);
    }
      int climbStairs2(int n, int[] dp) {
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
    int ans = climbStairs2(n-1, dp)+ climbStairs2(n-2, dp);
        dp[n] = ans;
        return ans;
    }
    
}