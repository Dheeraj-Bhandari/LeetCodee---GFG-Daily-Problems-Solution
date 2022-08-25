class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        
        for(int i=low; i<=high; i+=2) {
            if(i>high) break;
            count++;
        }
        if(low%2==0 && high%2==0){
        return count-1;
        }
        else if(low%2==0 && high%2==1){
        return count;
        }
        else return count;
    }
}