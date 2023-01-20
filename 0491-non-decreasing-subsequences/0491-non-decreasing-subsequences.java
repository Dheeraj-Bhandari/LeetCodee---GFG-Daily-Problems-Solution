class Solution {
    HashSet<List<Integer>> set = new HashSet<>();
    
    public List<List<Integer>> findSubsequences(int[] nums) {
         List<Integer> list = new ArrayList<>();
        backTrack(nums, 0, list);
        System.out.println(set);
        List<List<Integer>> ans = new ArrayList<>(set);
        
        
        
        return ans;
        
    }
    void backTrack(int[] nums, int idx, List<Integer> list){
        
        
        if(list.size()>=2)set.add(new ArrayList(list));
            
        
        for(int i=idx;i<nums.length; i++){
            
        if(list.size()==0 || list.get(list.size()-1)<=nums[i]){
            list.add(nums[i]);
            backTrack(nums, i+1, list);
            list.remove(list.size()-1);
        }
            
       
        }
    
    }
}