class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==1) return true;
         if(n%2==0) return false;
        
        double d= n/3.0;
        if(d%1!=0) return false;
        return isPowerOfThree((int)d);
        
    }
}