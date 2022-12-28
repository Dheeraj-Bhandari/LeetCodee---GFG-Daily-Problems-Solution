class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        
        for(int i:piles)pq.add(i);
        
        while(k!=0){
            int c = pq.poll();
            // System.out.println(pq);
            int r =c/2;
            System.out.println(c-2);
            pq.add(c-r);
            // System.out.println(pq);
            k--;
        }
        
        int total = 0;
        for(int i:pq)total+=i;
        return total;
    }
}