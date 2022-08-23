class Solution {
    public String getHint(String secret, String guess) {
            
        int bulls=0;
        int cow = 0;
        
        int[] frq = new int[10];
        int[] frq2 = new int[10];
        
        for(int i=0; i<secret.length(); i++){
            char ch = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch==ch2) bulls++;
            else{
                int a = Character.getNumericValue(ch);
                frq[a]++;
                // if(frq[a]==0){
                //     frq[a]= a;
                // }
                // else{
                //     frq[a]++;
                // }
                
                int b  = Character.getNumericValue(ch2);
                frq2[b]++;
                //  if(frq2[b]==0){
                //     frq2[b]= b;
                // }
                // else{
                //     frq2[b]++;
                // }
                
            }
            
           
        }
         for(int i=0; i<frq.length; i++){
                cow+=Math.min(frq[i],frq2[i]);
            }
            String ans = "";
            return ans+bulls+"A"+cow+"B";
        
    }
}