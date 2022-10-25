class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      
        int w1 = 0;
        int w2 = 0;
        
        int i=0;
        int j=0;
        
        String s1 = "";
        String s2 = "";
        
        while(i<word1.length && j<word2.length){
            if(w1==0) s1 = word1[i];
            if(w2==0) s2 = word2[j];
            
            while(w1<s1.length() && w2 < s2.length()){
                if(s1.charAt(w1)!=s2.charAt(w2)) return false;
                w1++; w2++;
            }
            if(w1==s1.length()){
                w1=0;
                i++;
            }
            if(w2==s2.length()){
                w2=0;
                j++;
            }
            
        }
        return i==word1.length && j==word2.length &&  w1==0 && w2==0;
    }
}