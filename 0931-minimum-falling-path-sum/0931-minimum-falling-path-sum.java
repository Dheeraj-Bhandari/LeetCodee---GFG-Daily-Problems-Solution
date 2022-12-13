class Solution {
    int[][] dp = new int[101][101];
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        
        for(int i=0; i<c; i++){
            ans = Math.min(ans, rec(0, i, matrix));
        }
        
        return ans;
    }
    
    int rec (int i, int j, int[][] matrix){
        int r =matrix.length;
        int c = matrix[0].length;
        if(i==r)return 0;
        if(j<0  || j>=c) return Integer.MAX_VALUE;
        if(dp[i][j]!=0) return dp[i][j];
        int case1 = rec(i+1, j, matrix);
        int case2 = rec(i+1, j+1, matrix);
        int case3 = rec(i+1, j-1, matrix);
        
        return dp[i][j]=  matrix[i][j]+Math.min(case1, Math.min(case2, case3));
    }
}