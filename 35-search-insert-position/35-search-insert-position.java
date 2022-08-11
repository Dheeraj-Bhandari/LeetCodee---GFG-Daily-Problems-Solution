class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]) return nums.length;
        
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else if(nums[mid]<target){
                ans = mid;
                start = mid+1;
            }
        }
        return ans+1;
    }
}