class Solution {
    // int[] dist = new int[100005];
    int ans = 0;
    public int longestPath(int[] parent, String s) {
        int n  =parent.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++)list.add(new ArrayList<>());
        for(int i=1; i<n; i++){
            list.get(parent[i]).add(i);
        }
        
        
        dfs(0,s, list);
        return ans;
        
    }
    int dfs(int node, String s, List<List<Integer>> list){
        int max1= 0;
        int max2 = 0;
       
        for(int nei: list.get(node)){
          int res = dfs(nei, s, list);
            if(s.charAt(node)!=s.charAt(nei)){
              if(res>max1){
                  max2 = max1;
                  max1 = res;
              }
                else if(res>max2){
                    max2=res;
                }
                
            }
        }
        ans = Math.max(ans, 1+max1+max2);
        return 1+max1;
    }
}