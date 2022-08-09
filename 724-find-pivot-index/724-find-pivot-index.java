class Solution {
    public int pivotIndex(int[] nums) {
        
      
        long totalsum=0;
        long leftsum=0;
        for(int i:nums) totalsum +=i;
        
        for(int i =0; i<nums.length; i++){
            leftsum+=nums[i];
            if(totalsum-leftsum == leftsum-nums[i]) return i;
        }
       
        return -1;
    }
}