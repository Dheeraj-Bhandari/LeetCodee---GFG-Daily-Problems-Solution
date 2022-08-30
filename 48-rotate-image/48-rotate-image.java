class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[][] resultmat = new int[r][c];
            
        
             int j=0;
            int k=0;
            while(j<c){
            for( int i=r-1; i>=0; i--){
                resultmat[j][k] = matrix[i][j];
                k++;
             }
                j++; 
                k=0;
                
        }
       
        for(int m=0; m<r; m++){
            for(int n=0; n<c; n++){
                matrix[m][n] = resultmat[m][n];
            }
        }
    }
}