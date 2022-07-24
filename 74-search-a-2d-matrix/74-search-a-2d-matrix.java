class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       return (twoDMatrix(matrix,target));
    }
    
     boolean twoDMatrix(int[][] arr, int target){
        int n = arr[0].length;
         int m = arr.length;
       int row = 0, col =0;
        while( row<m &&  col < n ){
            
            if(arr[row][col] ==target) return true;
            else if(arr[row][n-1]<target) row++;
            else col++;
        }
        return false;
    }
}