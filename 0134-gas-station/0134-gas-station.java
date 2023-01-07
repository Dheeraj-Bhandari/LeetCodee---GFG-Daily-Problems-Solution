class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
       int totalFuel=0, totalCost=0;
        
        for(int i:gas)totalFuel+=i;
        for(int i:cost)totalCost+=i;
        if(totalFuel<totalCost) return -1;
        
        int start = 0,  curFuel = 0;
        for(int i=0; i<gas.length; i++){
            curFuel+=gas[i]-cost[i];
            if(curFuel<0){
                start = i+1;
                curFuel=0;
            }
        }
        return start;
    }
}