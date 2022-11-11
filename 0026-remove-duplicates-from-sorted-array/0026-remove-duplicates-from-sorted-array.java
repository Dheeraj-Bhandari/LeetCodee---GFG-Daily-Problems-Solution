class Solution {
    public int removeDuplicates(int[] nums) {
        

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=-101;
            }
        }
        
        int i=0, j=0;
       
        while(j<nums.length){
            if(nums[j]!=-101){
            nums[i]=nums[j];
            i++;
            
            }
           j++;
        }

      
        return i;
    }
}