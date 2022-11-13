class Solution {
    public String reverseWords(String s) {
        
        
        s = s.replaceAll("\\s+"," ").trim();
       
        
        String ans ="";
        int lastidx = s.length()-1;
        
        while(s.charAt(lastidx)==' ')lastidx--;
        
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(i==0){
                if(ch==' '){
                    ans+=s.substring(i+1, lastidx+1);
                }
                else{
                     ans+=s.substring(i, lastidx+1);
                }
            }
            
           
                
                if(ch==' '){
                ans+=s.substring(i+1,lastidx+1)+" ";
                    
                
                    
                lastidx = i-1;
                }
            
            
            
        }
        return ans;
    }
}