class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE , ans =0;
        
        for(int i : nums){
            ans+=i;
            if(ans<0){
                max = Math.max(max, ans);
                ans=0;
            }
           else max = Math.max(max, ans);
        }
        return max;
    }
}