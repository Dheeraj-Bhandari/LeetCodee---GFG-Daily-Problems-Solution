class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        

        int totalSum = 0;
        for(int i:nums)totalSum+=i;

        HashMap<Integer, Integer> map =  new HashMap<>();
        map.put(0,-1);

        int[] arr = new int[nums.length];
        
        int perSum=0;
        for(int i=0; i<nums.length; i++){
          

            arr[i] = perSum+nums[i];
            perSum = arr[i];
            if(map.containsKey(arr[i]%k)){
                int keyvalue = map.get(arr[i]%k);
                int diff = i-keyvalue;
                if(diff>=2) return true; 
            }
            else{
                map.put(arr[i]%k,i);
            }
        }
        return false;

    }
}