class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        int ans = 0;
    
        for(int i=0; i<n; i++ ){
            
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                  ans =  Math.max(ans, dfs(grid, i, j, n, m));
                }
            }
        }
        return ans;
    }
    int  dfs(int[][] grid, int i, int j, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]<=0) return 0;
        grid[i][j]=-1;
        
           int down =   dfs(grid, i+1, j, n,m);
           int right =  dfs(grid, i, j+1, n,m);
            int left = dfs(grid, i-1, j, n,m);
           int top = dfs(grid, i, j-1, n,m );
            return 1+top+down+right+left;
    }
   
}