class Solution {
   public static class pair implements Comparable <pair>{
       int val;
       int gap;
       
       pair(){
           
       }
       pair(int val, int gap){
           this.val = val;
           this.gap= gap;
       }
       public int compareTo(pair o){
           if(this.gap == o.gap){
               return this.val-o.val;
           }
           else{
               return this.gap-o.gap;
           }
       }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            if(pq.size()<k){
                pq.add(new pair(arr[i], Math.abs(arr[i]-x)));
            }
            else if(pq.peek().gap > Math.abs(arr[i]-x)){
                pq.remove();
                pq.add(new pair(arr[i], Math.abs(arr[i]-x)));
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        while(pq.size()>0){
            pair rem = pq.remove();
            list.add(rem.val);
        }
        Collections.sort(list);
        // System.out.println(pq);
        return list;
    }
}