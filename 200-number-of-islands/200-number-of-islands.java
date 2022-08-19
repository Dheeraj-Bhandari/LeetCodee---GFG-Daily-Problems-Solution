class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n = grid[0].length;
        int   max = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                   
                    max+=func(grid, i,j, m, n);
                    
                }
            }
        }
        return max;
        
    }
    
    int func(char[][] grid, int i, int j , int m , int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] =='0') return 0;
        
        grid[i][j] = '0';
        
        int down = func(grid, i+1, j, m, n);
        int right = func(grid, i, j+1, m, n);
        int top = func(grid, i-1, j, m, n);
        int left = func(grid, i, j-1, m, n);

        return 1;
        
        
    }
}