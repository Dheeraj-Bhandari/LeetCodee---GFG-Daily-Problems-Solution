class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        return fib2(n, dp);
    }
    int fib2(int n, int[]dp){
        if(n<0 || n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=0) return dp[n];
        
        int ans = fib2(n-1, dp)+fib2(n-2, dp);
        dp[n]= ans;
        return ans;
    }
}