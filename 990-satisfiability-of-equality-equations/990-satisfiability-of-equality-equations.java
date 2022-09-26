class Solution {
    int[] parent = new int[26];
    int[] rank = new int[26];
    public boolean equationsPossible(String[] equations) {
       for(int i=0; i<26; i++){
            parent[i] = i;
            rank[i] = 1;
       }
        
       for(String eq:equations){
           if(eq.charAt(1) == '='){
               union(eq.charAt(0)-'a', eq.charAt(3)-'a');
           }
       }
        
        for(String eq:equations){
           if(eq.charAt(1) == '!'){
               if(find(eq.charAt(0)-'a') == find(eq.charAt(3)-'a')) return false;
           }
        } 
        return true; 
    }
    
    public int find(int x){
        if(parent[x] == x) return x;
        
        int temp = find(parent[x]);
        parent[x] = temp;
        return temp;
    }
    
    public void union(int x, int y){
        int lx = find(x);
        int ly = find(y);
        
       if(lx!= ly){
           if(rank[lx] > rank[ly]){
               parent[ly] = lx;
           }
           else if(rank[ly] > rank[lx]){
               parent[lx]=ly;
           }
           else{
              parent[lx] = ly;
              rank[ly]++;
           }
       }
    }
}