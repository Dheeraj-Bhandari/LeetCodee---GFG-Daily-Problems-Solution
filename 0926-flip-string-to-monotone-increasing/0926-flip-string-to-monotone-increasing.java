class Solution {
    public int minFlipsMonoIncr(String s) {
        int one = 0, zero=0, i=0;
        int ans = -1;
        while(i<s.length() && s.charAt(i)=='0')i++;
        
        while(i<s.length()){
            if(s.charAt(i)=='0')zero++;
            else one++;
            if(zero>one)zero=one;
            i++;
        }
        // if(ans==-1)return zer;
        return zero;
    }
}