class Solution {
    public void moveZeroes(int[] nums) {
//         int n = nums.length-1;
        
//          for(int  j=0; j<nums.length; j++){
//         for(int  i=0; i<nums.length-1; i++){
            
//             if(nums[i]==0){
//                 int temp = nums[i+1];
//                 nums[i+1] = nums[i];
//                 nums[i] = temp;
                
//              }
//             }
//         }
        
        int pointer = 0;
        for(int number:nums){
            if(number!=0){
                nums[pointer]=number;
                pointer++;
            }
        }
        while(pointer!=nums.length) nums[pointer++]=0;
    }
}