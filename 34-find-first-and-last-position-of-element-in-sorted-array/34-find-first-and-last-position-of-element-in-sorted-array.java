class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] temp = {-1,-1};
        if(nums.length==0) {
            return temp;
        }
        temp[0] = first(nums,target);
        temp[1] = second(nums,target);
        return temp;   
    }
    int first(int  [] arr, int target){
        int res = -1;
        int s=0;
        int e = arr.length-1;
        while(s<=e){
        int mid=s+(e-s)/2;
          if(arr[mid]==target){
              res = mid;
              e =mid-1;
          }
            
        else if(arr[mid]>target){
                e = mid-1;
            }
        else if(arr[mid]<target)
            s=mid+1;
        }
        return res;
    }
    int second(int[] arr, int target){
        int res = -1;
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
          if(arr[mid]==target){
              res = mid;
             s =mid+1;

          }
            
            else if(arr[mid]>target){
                e = mid-1;
            }
             else if(arr[mid]<target)
            s=mid+1;
                }
        return res;
        }
 
}