class Solution {
    public int fib(int n) {
        return func(n, new int[n+1]);
    }
    
    int  func(int n , int[] dp){
    if(n==0 || n==1 ) return n;
        
    if(dp[n]!=0) return dp[n];
        
    int first = func(n-1,dp);     
    int sec = func(n-2 , dp);
        int ans = first+sec;
        
        dp[n] = ans;
        return ans;


}
}