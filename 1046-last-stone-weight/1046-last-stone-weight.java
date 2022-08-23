class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones)
            maxHeap.offer(i);
        while(maxHeap.size()>1){
            int y=maxHeap.poll();
            int x=maxHeap.poll();
            if(y-x!=0)
                maxHeap.offer(y-x);
        }
        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.poll();
    }
}