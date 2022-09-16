class Solution {int[][] dp = new int[1001][1001];
    public int maximumScore(int[] nums, int[] multipliers) {
      int n = nums.length,  m = multipliers.length;
        int dp[] = new int[m+1];
        
        for(int i=m-1; i>=0; i--){
            int mul = multipliers[i];
            for(int l=0; l<=i; l++){
                int r = n-1-(i-l);
                int left = nums[l]*mul+dp[l+1];
                int right= nums[r]*mul+dp[l];
                dp[l]= Math.max(left, right);
            }
        }
        return dp[0];
        
        
    }
}