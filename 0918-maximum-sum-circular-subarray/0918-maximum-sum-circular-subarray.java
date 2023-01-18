class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int x = kadane(nums);
        
        int y = 0;
        for(int i=0; i<nums.length; i++){
            y+=nums[i];
            nums[i] *= -1;
        }
        int z = kadane(nums);
        if(y+z==0)return x;
        return Math.max(x, y+z);
    }
    
    int kadane(int[] nums){
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i:nums){
            ans+=i;
            if(ans<0){
                max = Math.max(max, ans);
                ans = 0;
            }
            else max = Math.max(max, ans);
        }
        return max;
    }
}