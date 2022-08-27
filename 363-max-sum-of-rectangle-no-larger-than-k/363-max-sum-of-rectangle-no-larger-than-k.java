class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<row; i++){
            int[] colsum = new int[col];
            for(int j=i; j<row; j++){
                for(int c=0; c<col; c++){
                    colsum[c]+= matrix[j][c];
                    
                }
                max= Math.max(max, find(colsum, k));
            }
        }
        return max;
      
        
        
    }
    int find(int[] sum , int k){
        int result = Integer.MIN_VALUE;
        TreeSet<Integer> set =new TreeSet<>();
        set.add(0);
        int prefixSum = 0;
        for(int i=0; i<sum.length; i++){
            prefixSum +=sum[i];
            Integer target = set.ceiling(prefixSum-k);
            if(target!=null){
                result = Math.max(result, prefixSum-target);
            }
            set.add(prefixSum);
        }
        return result;
    }
}