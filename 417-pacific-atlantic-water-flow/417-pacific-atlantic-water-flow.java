class Solution {
    
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> ans = new ArrayList<>();
        int r = matrix.length;
        if(r==0) return ans;
        int c = matrix[0].length;
        
        
        boolean[][] pac = new boolean[r][c];
        boolean[][] atl = new boolean[r][c];
        
        for(int i=0; i<c; i++){
            dfs(0, i, pac, matrix, -1);
            dfs(r-1, i, atl, matrix, -1);
        }
        
        for(int i=0; i<r; i++){
            dfs(i, 0, pac, matrix, -1);
            dfs(i, c-1, atl, matrix, -1);
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(pac[i][j]==true && atl[i][j]==true){
                    List<Integer> list=  new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
        
    }
    void dfs(int i, int j, boolean[][] istrue, int[][]matrix, int prevHeight ){
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || istrue[i][j]==true || matrix[i][j]<prevHeight) return;
        istrue[i][j]= true;
        
        dfs(i+1, j, istrue, matrix, matrix[i][j]);
        dfs(i-1, j, istrue, matrix, matrix[i][j]);
        dfs(i, j+1, istrue, matrix, matrix[i][j]);
        dfs(i, j-1, istrue, matrix, matrix[i][j]);
    }
}