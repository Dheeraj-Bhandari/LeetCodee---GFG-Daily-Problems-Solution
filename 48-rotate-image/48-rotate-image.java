class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
//         int[][] resultmat = new int[r][c];
            
//             int j=0;
//             int k=0;
//             while(j<c){
//             for( int i=r-1; i>=0; i--){
//                 resultmat[j][k] = matrix[i][j];
//                 k++;
//              }
//                 j++; 
//                 k=0;   
//         }
//         for(int m=0; m<r; m++){
//             for(int n=0; n<c; n++){
//                 matrix[m][n] = resultmat[m][n];
//             }
//         }
        
        transpose(matrix, r, c);
        
        swap(matrix,r,c);
    
            
        
    }
    void transpose(int[][] matrix, int r, int c){
        for(int i =0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp  =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    void swap(int[][] matrix, int r, int c){
        int lastcol = r-1;
        int firstcol= 0;
       while(firstcol<lastcol){
           
           for(int i=0; i<r; i++){
               int temp = matrix[i][firstcol];
               matrix[i][firstcol] = matrix[i][lastcol];
               matrix[i][lastcol]= temp;
           }
           lastcol--;
           firstcol++;
           
       }
    }
}