class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                   if(check(grid, i, j, m, n)==true){
                       max++;
                   }
                }
            }
        }
        return max;
    }
    private boolean check(char[][] grid, int i, int j, int m, int n){
        if(i>=m || i<0 || j>=n || j<0 || grid[i][j]=='0') return false;
        
        grid[i][j] ='0';
        
        check(grid, i-1, j,m,n);
        check(grid, i+1, j, m,n);
        check(grid, i, j-1 ,m ,n);
        check(grid, i, j+1, m, n);
        return true;
        
    }
}