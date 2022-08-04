class Solution {
    public int mirrorReflection(int p, int q) {
        int hcf =gcd(p,q);
        int m = p/hcf; 
        int n = q/hcf;
        
        if(n%2!=0){
            if(m%2==0) return 2;
            return 1;
        }
       
       return 0;
        
    }
    int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a, a);
    }
}