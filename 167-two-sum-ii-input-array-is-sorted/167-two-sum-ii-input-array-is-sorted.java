class Solution {
    public int[] twoSum(int[] arr, int target) {
        int s=0; 
        int e= arr.length-1;
     while(s<=e){
         int mid = arr[s]+arr[e];
         if(mid==target) break;
         else if(mid>target) e--;
         else s++;
     }
        return new int[]{s+1,e+1};
    }
}