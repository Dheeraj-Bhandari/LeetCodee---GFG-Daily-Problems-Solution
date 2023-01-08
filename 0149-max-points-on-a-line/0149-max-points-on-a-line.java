class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        
        if(n==1) return 1;
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                
                int count =2;
                
                int dx = points[j][0]-points[i][0];
                int dy = points[j][1]-points[i][1];
                
                for(int k=0; k<n; k++){
                    
                    if(k!=i && k!=j){
                        int dx_=  points[k][0] - points[i][0];
                        int dy_ = points[k][1] - points[i][1];
                        
                        if(dy*dx_ == dy_ *dx){
                            count++;
                        }
                    }
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }
}