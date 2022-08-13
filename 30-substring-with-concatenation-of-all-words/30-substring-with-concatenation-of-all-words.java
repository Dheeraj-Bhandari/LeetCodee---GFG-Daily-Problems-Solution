class Solution {
    public List<Integer> findSubstring(String str, String[] words) {
        
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            map.put(words[i], map.getOrDefault(words[i] ,0)+1);
        }
        
        int totalwords = words.length;
        int eachwordlength = words[0].length();
        
        
        List<Integer> list = new ArrayList<>(); 
        
        
     for(int i=0; i<=str.length()-(totalwords*eachwordlength); i++){
         
         Map<String, Integer > seenword = new HashMap<>(map);
         
         for(int j=0; j<totalwords; j++){
             //int wordIdx = i+j*eachwordlength;
             
             String word = str.substring(i+j*eachwordlength, i+j*eachwordlength+eachwordlength);
             
            if(seenword.containsKey(word)){
                int count = seenword.get(word);
                if(count==1) seenword.remove(word);
                else seenword.put(word, count-1);
                if(seenword.isEmpty()){
                    list.add(i);
                    break;
                }
                
            }
             else{
                 break;
             }
             
         }
         
     }
        
        return list;
        
    }
}