class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        int x= 1;
       while(n!=Math.pow(4, x)){
           if(Math.pow(4, x)>n) return false;
           x++;
       }
        return true;
    }
}