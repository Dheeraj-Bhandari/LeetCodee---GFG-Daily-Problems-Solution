class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums , mid, low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
                
            }
        }
        // return nums;
    }
    void swap(int [] arr, int mid, int low){
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low]= temp;
    }
}