class Solution {
    private int[] ans;
    private List<List<Integer>> adj;
    private Set<Integer> set;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
       adj = new ArrayList<>();
        ans = new int[n];
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        set = new HashSet<>();
         dfs(0, labels);
        return ans;
        
        
    }
    private int[] dfs(int node, String label){
        set.add(node);
        int[] count = new int[26];
        
        for(int nei : adj.get(node)){
            if(!set.contains(nei)){
                set.add(nei);
                int[] adjCount  = dfs(nei, label);
                for(int i=0; i<26; i++){
                    count[i]+= adjCount[i];
                }
                
            }
        }
        char ch = label.charAt(node);
        count[ch-'a']++;
        ans[node] = count[ch-'a'];
        return count;
    }
}