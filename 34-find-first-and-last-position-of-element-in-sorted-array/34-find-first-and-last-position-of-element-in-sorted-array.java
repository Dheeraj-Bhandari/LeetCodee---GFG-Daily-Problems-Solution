class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = lefty(nums, target, false);
        if(left<0) return new int[] {-1,-1};
        int right = lefty(nums, target, true);
        return new int[] {left, right};
    }
   int lefty(int [] arr, int target, boolean leftmost){
       int idx  =-1;
       int s=0;
       int e = arr.length-1;
       while(s<=e){
           int mid = s+(e-s)/2;
           if(arr[mid]<target) s=mid+1;
           else if(arr[mid]>target) e = mid-1;
           else if(arr[mid]==target){
               idx = mid;
               if(leftmost) s=mid+1;
               else e=mid-1;
           }
       }
       return idx;
   }
}