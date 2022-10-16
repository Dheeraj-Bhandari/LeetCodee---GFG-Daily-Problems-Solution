class Solution {

public int minDifficulty(int[] jobDifficulty, int d) {
    
   
   if(d > jobDifficulty.length)
       return -1;
    
    
   int [][]dp = new int[jobDifficulty.length][d];
   
   int max = Integer.MIN_VALUE;
   for(int i = 0 ; i < jobDifficulty.length ; i++){
       
       max = Math.max(max, jobDifficulty[i]);
       dp[i][0] = max;
   }
    
   for(int i = 1 ; i < jobDifficulty.length ; i++){
       
       for(int j = 1; j <= i && j  < d ; j++){
           
           max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;
           for(int k = i ; k >= j ; k--){
               
               max = Math.max(max, jobDifficulty[k]);
               min = Math.min(dp[k - 1][j - 1] + max, min);
           }
           
           dp[i][j] = min;
       }
   }
    
   return dp[dp.length - 1][d - 1];
   
    
}
}