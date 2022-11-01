class Solution {
    public int[] findBall(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length; 
        
        int[] ans = new int[m];
        
        for(int j=0; j<m; j++){
            int cpos = j;
            int npos= -1;
            
            for(int i=0; i<n; i++){
                npos=cpos+grid[i][cpos];
                
                if(npos<0 || npos>=m || grid[i][cpos]!=grid[i][npos]){
                    cpos=-1;
                    break;
                }
                cpos=npos;
            }
            ans[j] = cpos;
        }
        return ans;
    }
}