class Solution {
    public String reverseWords(String s) {
       
        String ans ="";
        int eidx = -1;
        int first = 0;
        if(s.contains(" ")==false)  return reverse(s,0, s.length()-1);
        for(int i=0; i<s.length(); i++){
            char ch  =s.charAt(i);
            
            if(ch==' ' && first ==0){
                
               
                int end = i;
                ans+=reverse(s, 0, end-1)+" ";
                    
                eidx = i+1;
                first++;
            }
             else if( first!=0 && i==s.length()-1){
              
                int end = i;
               ans+=reverse(s, eidx, end);
               
                
            }
            else if(ch==' ' && first!=0 && i!=s.length()-1){
              
                int end = i;
               ans+=reverse(s, eidx, end-1)+" ";
               
                eidx = i+1;
            }
           
            
           
        }
        return ans;
        
    }
    String reverse(String s,  int i , int j){
        String ans = "";
      for(int k =j; k>=i; k--){
          ans+=s.charAt(k);
      }
        return ans;
    }
}