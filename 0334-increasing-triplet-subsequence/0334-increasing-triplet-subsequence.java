class Solution {
    public boolean increasingTriplet(int[] nums) {
     
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for(int i:nums){
            if(i<max1)max1=i;
            else if(i<max2 &&  i>max1)max2=i;
            else{
                if(i>max1 && i>max2)return true;
            }
        }
        return false;

    }
}