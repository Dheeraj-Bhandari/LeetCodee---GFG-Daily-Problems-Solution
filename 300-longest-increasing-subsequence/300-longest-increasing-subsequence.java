class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int [nums.length];
        int max = 0;
        for(int i=0; i<dp.length; i++){
            int sum=0;
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    if(sum<dp[j]) sum = dp[j];
                }
            }
            dp[i]=sum+1;
            max= Math.max(max, dp[i]);
        }
        return max;
    }
}