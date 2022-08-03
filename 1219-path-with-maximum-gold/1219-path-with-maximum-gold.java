class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        boolean[][] bool = new boolean[m][n];
        for(int i=0; i<m; i++){
            
            for(int j=0; j<n; j++){
                if(grid[i][j]!=0 && bool[i][j]==false){
                    ArrayList<Integer> list  =new ArrayList<>();
                     int pathgold = func(grid, i, j, list, bool,0);
                    // int sum=0; 
                    // for(int val : list){
                    // sum+=val;   
                    // }
                    max= Math.max(pathgold, max);
                }
               
            }
        }
        return max;
    }
    int func(int[][] grid, int i, int j, ArrayList<Integer> list,  boolean[][] bool, int pathgold){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || bool[i][j]==true) return pathgold;
        if(grid[i][j]==0) return pathgold;
        list.add(grid[i][j]);
        bool[i][j] =true;
        int maxgold = pathgold;
        pathgold+=grid[i][j];
        
       maxgold = Math.max(maxgold, func(grid, i-1, j, list, bool,pathgold));
      maxgold =  Math.max(maxgold, func(grid, i+1 , j, list, bool, pathgold));
       maxgold = Math.max(maxgold, func(grid, i, j-1, list, bool, pathgold));
       maxgold =  Math.max(maxgold, func(grid, i, j+1, list, bool, pathgold));
        bool[i][j] =false;
        return maxgold;
        // return;
    }
}