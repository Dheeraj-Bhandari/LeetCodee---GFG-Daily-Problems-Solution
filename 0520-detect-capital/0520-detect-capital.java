class Solution {
    public boolean detectCapitalUse(String word) {
        boolean firstWordCap = false;
        boolean SecondWordCap = false;
        
        if(word.length()==1) return true;
        
        char ch = word.charAt(0);
        char ch2 = word.charAt(1);
        if(Character.isUpperCase(ch)){
                firstWordCap = true;
                
            }
         if(Character.isUpperCase(ch2)){
               SecondWordCap = true;
           }
        if(!firstWordCap && SecondWordCap) return false;
        
        for(int i=2; i<word.length(); i++){
             ch = word.charAt(i);
            if(firstWordCap && SecondWordCap){
                if(!Character.isUpperCase(ch)) return false;
            }
            else if(firstWordCap && !SecondWordCap){
                if(Character.isUpperCase(ch)) return false;
            }
            else if(!firstWordCap && !SecondWordCap){
                if(Character.isUpperCase(ch)) return false;
            }
            
        }
        return true;
    }
}