class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] gap = new int[rocks.length];
        
        for(int i=0; i<rocks.length; i++){
            gap[i] = capacity[i] -rocks[i];
        }
        Arrays.sort(gap);
        // System.out.println(Arrays.toString(gap));
        int count=0;
        for(int num:gap){
            if(additionalRocks-num>=0){
                count++;
                additionalRocks-=num;
            }
            else break;
        }
        return count;
    }
}