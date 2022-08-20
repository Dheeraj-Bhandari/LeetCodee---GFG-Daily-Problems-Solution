class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int curpos= startFuel;
        int noOfStop =0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        
        for(int[] station:stations){
            int nextstation = station[0];
            int fuelatstation = station[1];
            
            while(curpos<nextstation){
                if(pq.isEmpty()) return -1;
                int curfuel = pq.poll();
                curpos+=curfuel;
                noOfStop++;
            }
            pq.offer(fuelatstation);
        }
        while(curpos<target){
                if(pq.isEmpty()) return -1;
                int curfuel = pq.poll();
                curpos+=curfuel;
                noOfStop++;
            }
        return noOfStop;
    }
}       