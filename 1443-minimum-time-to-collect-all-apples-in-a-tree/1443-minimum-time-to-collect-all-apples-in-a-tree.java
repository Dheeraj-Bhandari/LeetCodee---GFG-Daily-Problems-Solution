class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer> > adj = new ArrayList<>();
        
        for(int i=0; i<n; i++)adj.add(new ArrayList<>());
        
        for(int[] edge : edges){
            int u = edge[0];
            int v =  edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return shortPath(0, adj, hasApple, 0);

    }
        
    int shortPath(int idx,  List<List<Integer> > adj, List<Boolean> hasApple , int parent){
        int pathLength =0;
        
        for(int nbr : adj.get(idx)){
            
            if(nbr!=parent){
                pathLength+= shortPath(nbr, adj, hasApple, idx);
            }
        }
        if(idx!=0 && (hasApple.get(idx) || pathLength > 0)){
            pathLength+=2;
        }
        return pathLength; 
    }
}