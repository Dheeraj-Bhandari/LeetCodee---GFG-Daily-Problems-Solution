class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int ans =0;
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int num1 = nums1[i-1];
                int num2 = nums2[j-1];
                
                if(num1!=num2){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                 ans=Math.max(ans,dp[i][j]);
            }
            
           
        }
        return ans;
    }
}