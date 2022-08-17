class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        
        int n = image.length;
        int m = image[0].length;
        
        int color = image[sr][sc];
        if(color==newcolor) return image;
        floodFillrec(image, sr, sc, n , m, color, newcolor);
        return image;
        
    }
    boolean isvalid(int[][] image, int i, int j, int n , int m, int color){
        if(i>=0 && i<n && j>=0 && j<m && image[i][j]==color) return true;
        return false;
    }
    
    void floodFillrec(int[][] image, int i, int j, int n , int m, int color, int newcolor){
      image[i][j]=newcolor;
        
        if(isvalid(image, i+1, j, n, m, color)){
            floodFillrec(image, i+1, j, n, m, color, newcolor);
        }
         if(isvalid(image, i-1, j, n, m, color)){
            floodFillrec(image, i-1, j, n, m, color, newcolor);
        }
         if(isvalid(image, i, j+1, n, m, color)){
            floodFillrec(image, i, j+1, n, m, color, newcolor);
        }
         if(isvalid(image, i, j-1, n, m, color)){
            floodFillrec(image, i, j-1, n, m, color, newcolor);
        }
    }
}