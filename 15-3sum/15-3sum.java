class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
           if(i==0 || nums[i]!=nums[i-1]){
                towpointer(nums,0-nums[i], i+1, nums.length-1 );
           }
           
        }
        return ans;
        
    }
    
    void towpointer(int[] arr, int target, int s , int e){
        int temp = s-1;
        while(s<e){
            if(arr[s]+arr[e]>target) e--;
            else if(arr[s]+arr[e]<target) s++;
            else{
                List<Integer> list = new ArrayList<>();
                list.add(arr[temp]); list.add(arr[s]);list.add(arr[e]);
                ans.add(list);
                while(s<e &&  arr[s]==arr[s+1])s++;
                while(s<e &&  arr[e]==arr[e-1])e--;
                s++;
                e--;
            }
        }
        
        
    }
       
}