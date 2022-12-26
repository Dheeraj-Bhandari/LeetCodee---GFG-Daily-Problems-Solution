class Solution {
    public boolean canJump(int[] nums) {
        
       int maxrach = 0;
        
        for(int i=0; i<nums.length; i++){
            if(maxrach<i) return false;
            maxrach = Math.max(maxrach, i+nums[i]);
        }
        return true;
      
    }
}