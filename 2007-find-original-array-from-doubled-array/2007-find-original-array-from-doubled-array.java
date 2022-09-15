class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length==1)return new int[]{};
        
        Arrays.sort(changed);
        List<Integer> ans = new ArrayList<>();
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i=0; i<changed.length; i++){
            if(q.size()>0 && q.peek()==changed[i]){
                q.remove();
            }
            else{
                ans.add(changed[i]);
                q.offer(changed[i]*2);
            }
        }
        
        
       if(q.size()>0)return new int[]{};
       
     
      else {
            int[] arr = new int[ans.size()];
            for(int i=0;i<ans.size();i++)arr[i]=ans.get(i);
            return arr;
        }
       
    }
}