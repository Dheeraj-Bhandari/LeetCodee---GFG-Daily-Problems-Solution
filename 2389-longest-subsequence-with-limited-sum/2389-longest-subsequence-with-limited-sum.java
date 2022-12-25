class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans =  new int[queries.length];
        
        
        Arrays.sort(nums);
        
       
        for(int i=0; i<queries.length; i++){
            
        
            int sum = 0;
        for(int j=0; j<nums.length; j++){
            
            sum+=nums[j];
            if(sum>queries[i] && sum-nums[j]<=queries[i]){
                ans[i] = j;
                System.out.println(ans[i]+ " " +j);
                break;
             }
            else{
                ans[i] = j+1;
            }
         }
            
       }
        return ans;
    }
}