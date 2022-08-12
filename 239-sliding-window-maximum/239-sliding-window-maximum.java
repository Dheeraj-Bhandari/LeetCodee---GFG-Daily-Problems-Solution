class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     Deque<Integer> dq = new ArrayDeque<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<k; i++){
            while(dq.size()>0 && dq.peekLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        
        list.add(dq.peekFirst());
        for(int i=k; i<nums.length; i++){
            if(dq.peekFirst()==nums[i-k])dq.removeFirst();
            
             while(dq.size()>0 && dq.peekLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
            list.add(dq.peekFirst());
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
       
          return ans;  
    }
}