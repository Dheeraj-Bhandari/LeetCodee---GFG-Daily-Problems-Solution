class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length) return;
        if(k>nums.length){
            k = Math.abs(k%nums.length);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=nums.length-k; i<nums.length; i++){
            list.add(nums[i]);
        }
        int m =nums.length-1;
        for(int i = nums.length-k-1; i>=0; i--){
            nums[m] = nums[i];
            m--;
        }
        for(int i = 0; i<k; i++){
            nums[i] = list.get(i);
            
        }
        return;
    }
}