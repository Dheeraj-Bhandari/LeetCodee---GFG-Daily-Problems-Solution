class Solution {
    public boolean exist(char[][] board, String word) {
        char fword = word.charAt(0);
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(fword==board[i][j]){
                   if( bfs(board, i, j, 0, visited, word))return true;
                }
            }
        }
        return false;
    }
    
    boolean bfs(char[][] board, int i, int j, int index, boolean visited[][], String word){
        if(index==word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(index))return false;
        
        visited[i][j] = true;
        
        boolean found = bfs(board, i+1, j, index+1, visited, word) ||
            bfs(board, i, j+1, index+1, visited, word) ||
            bfs(board, i-1, j, index+1, visited, word) ||
            bfs(board, i, j-1, index+1, visited, word);
            
        
        visited[i][j]=false;
        return found;
    }
}