class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=1; i<=n; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        for(int[] arr  : dislikes){
            map.get(arr[0]).add(arr[1]);
            map.get(arr[1]).add(arr[0]);
           
        }
        
       
        int[] color = new int[n+1];
        Arrays.fill(color, -1);
       
        
        
        
        for(int i=1; i<=n; i++){
            if(color[i]==-1){
                 Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] = 1;
             while(q.size()>0){
            
            int node = q.poll();
            int nodecolor = color[node];
          
            for(int nei : map.get(node)){
                if(color[nei]==nodecolor){
                    return false;
                }
                else if(color[nei]==-1){
                    if(nodecolor ==1){
                        color[nei] = 0;
                    }
                    else{
                        color[nei] = 1;
                    }
                    q.add(nei);
                    
                }  
            }
        }
            }
            
        }
       

        return true;
    }
}