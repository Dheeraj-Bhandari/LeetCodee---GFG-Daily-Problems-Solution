class Solution {
    public int minPathSum(int[][] grid) {
        
        
        int row = grid.length;
        int col  = grid[0].length;
        int [][]dp = new int[row][col];
        // dp[0]= grid[row-1][col-1];
            
        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=0; j--){
                if(i==row-1 && j == col-1){
                    dp[i][j] = grid[i][j];
                }
                else if(i==row-1){
                    dp[i][j] = grid[i][j]+dp[i][j+1];
                }
                
                else if(j==col-1){
                    dp[i][j] = grid[i][j]+dp[i+1][j];
                }
                else{
                     dp[i][j] = Math.min(dp[i][j+1] , dp[i+1][j])+grid[i][j];
                }
            }
        }
        return dp[0][0];
    }
}