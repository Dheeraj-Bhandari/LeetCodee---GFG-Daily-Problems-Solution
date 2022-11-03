class Solution {
    public int longestPalindrome(String[] words) {
        if(words.length==0) return 0;
        
        Set<String> visited = new HashSet<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        int length = 0;
        boolean singlePairString = false;
        for(String str:words){
            String reverseStr = reverse(str);
            
            if(map.containsKey(str)&& map.containsKey(reverseStr) &&  !visited.contains(str) && !visited.contains(reverseStr) && !str.equals(reverseStr)){
                int strCount = (map.get(str)) ;
                int reverseStrCount = map.get(reverseStr) ;
                length += (Math.min(strCount, reverseStrCount))*4;
                
                visited.add(str);
                visited.add(reverseStr);
            }
            else if(str.equals(reverseStr) && !visited.contains(str)){
               int strCount = (map.get(str)) ;
                if(strCount%2==0){
                    length+=strCount*2;
                }
                else{
                    strCount-=1;
                    length+=strCount*2;
                    singlePairString= true;
                }
                visited.add(str);
            }
            
            
        }
        
        return singlePairString? length+2 : length ;
    }
    String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
            
        }
        return sb.toString();
    }
}