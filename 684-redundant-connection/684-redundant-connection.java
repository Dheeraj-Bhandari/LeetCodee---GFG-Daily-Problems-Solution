class Solution {
    public int[] findRedundantConnection(int[][] edges) {
     int[] arr = new int[1001];
        for(int i=0; i<arr.length; i++){
            arr[i] =i;
        }
        int[] ans = new int[2];
        for(int[] v:edges){
            int n1= v[0];
            
            int n2= v[1];
            System.out.println(n1+" "+n2);
            int p1 = findparent(n1, arr);
            int p2 = findparent(n2, arr);
            System.out.println(p1+" "+p2);
            if(p1==p2){
                ans[0]=n1;
                ans[1]=n2;
            }
            arr[p1]=p2;
        }
        
       return ans;
    }
    int findparent(int n, int[] arr){
        if(n==arr[n]){
            return n;
        }
        return findparent(arr[n], arr);
    }
    
}