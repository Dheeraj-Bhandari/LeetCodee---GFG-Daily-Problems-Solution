class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)return 1;
        int [] arr =  new int[n+1];
        
        for(int[] list : trust){
            arr[list[0]]--;
            arr[list[1]]++;
        }
        
        for(int i=0; i<=n; i++)if(arr[i]==n-1)return i;
        return -1;
    }
}