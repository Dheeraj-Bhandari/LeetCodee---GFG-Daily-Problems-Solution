class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        //Sort First Half of matrix diagnal.
        for(int i=0; i<m; i++){
            sortmatrix(mat, i, 0);
        }
         //Sort Second Half of matrix diagnal.
        for(int j=1; j<n; j++){
            sortmatrix(mat, 0, j);
        }
        return mat;
    }
    
    int[][] sortmatrix(int[][] mat, int r, int c){
        int m = mat.length;
        int n = mat[0].length;
        
        int i=r;
        int j=c;
        
        int[] map = new int[101];
        //fill map with matrix frq
        
        while(i<m && j<n ){
            map[mat[i][j]]++;
            i++;
            j++;
        }
        
        i=r;
        j=c;
        
        for(int k=1; k<map.length; k++){
            while(map[k]>0){
                mat[i][j]= k;
                map[k]--;
                i++;
                j++;
            }
        }
        return mat;
    }
}