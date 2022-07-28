class Solution {
    public int minOperations(int n) {
        int min  =1;
        int max = (2*n-1)+1;
        int equalavg = (min+max)/2;
        int ans=0;
        for(int i=0; i<n/2; i++){
            ans+= Math.abs(((2*i)+1)-equalavg);
        }
        return ans;
    }
}