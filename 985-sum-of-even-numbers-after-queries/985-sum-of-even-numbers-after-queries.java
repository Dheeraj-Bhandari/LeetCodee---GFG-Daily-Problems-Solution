class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[nums.length];
        int n =0;
        
            int sum=0;
            for(int i:nums){
                
                if(i%2==0){
                    sum+=i;
                }
            } 
        for(int[] row:queries){
           
            for(int i=0; i<row.length-1; i++){
                int index = row[i+1];
                 int value = row[i];
                int prev = nums[index];
                int next = nums[index]+value;
                
                if(prev%2==0 &&  next%2==0){
                    sum+=value;
                   
                }
                else if(prev%2==0){
                    sum-=prev;
                }
                 else if(next%2==0){
                    sum+=next;
                }
                nums[index] = nums[index]+value;
                ans[n]= sum;
                n++;
            }
            
            
        }
        
        return ans;
    }
}