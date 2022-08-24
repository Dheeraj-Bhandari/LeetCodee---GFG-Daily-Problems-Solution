class Solution {
    public boolean isPowerOfThree(int n) {
        
//          if(n==1) return true;
//          if(n%2==0) return false;
        
//         if(n<=0 || n%3!=0) return false;
//         return isPowerOfThree(n/3);
        
        while(n%3==0 && n>0) n=n/3;
        return n==1?true:false;
        
        // return (n>0 && 1162261467 % n == 0);
        
    }
}