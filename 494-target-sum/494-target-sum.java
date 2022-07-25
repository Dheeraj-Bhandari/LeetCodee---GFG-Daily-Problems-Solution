class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
     return  func(nums, target, 0,0);
      
        
    }
    
    int func(int[] arr, int target, int index, int sum){
        
        if(sum==target && index==arr.length){
            return 1;
        }
        if(index>=arr.length) return 0;
        
      
           
           int b=  func(arr, target, index+1, sum+arr[index]); 
          int a=   func(arr, target, index+1, sum-arr[index]); 
        return a+b;
    }
}