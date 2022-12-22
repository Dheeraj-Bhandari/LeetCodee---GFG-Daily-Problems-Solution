class Solution {
    int[] res;
    int[] count;
    List<HashSet<Integer>> tree; 
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        tree=  new ArrayList<>();
        res = new int[n];
        count = new int[n];
        
        for(int i=0; i<n; i++)
            tree.add(new HashSet<Integer>());
        for(int[] e:edges){
                tree.get(e[0]).add(e[1]);
                tree.get(e[1]).add(e[0]);
            }
        
        postOrder(0,-1);
         preOrder(0,-1);
        return res;
    }
    
    void postOrder(int root, int pre){
        for(int i:tree.get(root)){
            if(i==pre)continue;
            postOrder(i, root);
            count[root] +=count[i];
            res[root]+= res[i]+count[i];
        }
        count[root]++;
    }
    
    void preOrder(int root, int pre){
          for(int i:tree.get(root)){
            if(i==pre)continue;
           res[i] = res[root]-count[i]+count.length-count[i];
              preOrder(i, root);
        }
    }
}