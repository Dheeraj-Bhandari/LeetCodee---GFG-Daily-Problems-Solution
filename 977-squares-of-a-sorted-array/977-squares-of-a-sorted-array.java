class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr= new int[nums.length];
        int s =0;
        int e = nums.length-1;
        int i =nums.length-1;
        while(s<=e){
            if(nums[s]*nums[s]>=nums[e]*nums[e]){
                arr[i] = nums[s]*nums[s];
                i--;
                s++;
            }
            else{
                arr[i]= nums[e]*nums[e];
                i--;
                e--;
            }
            
        }
        return arr;
    }
}