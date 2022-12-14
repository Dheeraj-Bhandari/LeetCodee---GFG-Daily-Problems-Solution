class Solution {
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return func(nums, 0, dp);
        
    }
    
    int func(int[] nums, int index, int[] dp){
        if(index>=nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        
        int countCurIndex = nums[index]+ func(nums, index+2, dp);
        
        int skipCurIndex = func(nums, index+1, dp);
        
        return dp[index] = Math.max(countCurIndex, skipCurIndex);
        
    }
}