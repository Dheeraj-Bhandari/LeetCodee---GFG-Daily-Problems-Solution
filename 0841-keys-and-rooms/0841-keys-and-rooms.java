class Solution {
   
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       
        boolean[] visited = new boolean[rooms.size()];
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);
        visited[0] = true;
        
        while(!stack.isEmpty()){
            
            int key = stack.pop();
            
            for(int nei : rooms.get(key)){
                if(!visited[nei]){
                    visited[nei] = true;
                    stack.push(nei);
                }
                
            }
        }
        
        for(boolean bool : visited){
            if(bool==false) return false;
        }
        return true;
        
    }
}