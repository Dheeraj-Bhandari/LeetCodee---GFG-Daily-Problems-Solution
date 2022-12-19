class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++)map.put(i, new ArrayList<>());

        for(int[] edge : edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        bfs(map, source, destination, visited);
        return found;

    }

    void bfs( Map<Integer, List<Integer>> map, int start , int end , boolean[] visited){
        if(visited[start] || found) return;
        visited[start] = true;
        for(int nei : map.get(start)){
            if(nei==end){
                found = true;
                return;
            }
            if(!visited[nei]) bfs(map, nei, end, visited);
        }

    }
    
}