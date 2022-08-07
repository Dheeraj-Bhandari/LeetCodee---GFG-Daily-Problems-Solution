class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int sum= 0;
        for(int s:nums)sum+=s;
        int n=nums.length;
      int [][] dp =new int[n][n];
        for(int g=0; g<dp.length; g++){
            for(int i=0, j=g; j<dp.length; i++,j++){
              if(g==0){
                  dp[i][j]=nums[i];
              }  
                 else if(g==1){
                dp[i][j] =Math.max(nums[i], nums[j]);
              }
                else{
                    int val1= nums[i]+Math.min(dp[i+2][j], dp[i+1][j-1]);
                    int val2= nums[j]+Math.min(dp[i+1][j-1], dp[i][j-2]);
                    dp[i][j]= Math.max(val1, val2);
                }
            }
        }
        int score =dp[0][dp[0].length-1];
        int score2 = sum-score;
        return score>=score2?true:false;
    }
}