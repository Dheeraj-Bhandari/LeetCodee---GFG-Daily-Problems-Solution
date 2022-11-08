class Solution {
    public String makeGood(String s) {
       
        StringBuilder sb = new StringBuilder(s);
        
        for(int i =0; i<sb.length()-1; i++){
                int ch =  (int) sb.charAt(i);
                int ch2 = (int)  sb.charAt(i+1);
            
            if(Math.abs(ch - ch2)==32){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                
                if(i==0) i--;
                else i-=2;
            }
            if(sb.length()==0) return "";
           
            
        }
        return sb.toString();
        
    }
}