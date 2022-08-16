class Solution {
    public int firstUniqChar(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         char [] ch  = s.toCharArray();
//         for(char c :ch){
//             map.put(c, map.getOrDefault(c , 0)+1);
//         }
        
//        for(int i=0; i<ch.length; i++){
//            if(map.containsKey(ch[i])) {
//                if(map.get(ch[i])==1){
//                    return i;
//                }
//            }
//        }
        
//         return -1;

        
        int ans =-1;
        for(char c:s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c)) return s.indexOf(c);
        }
        return ans;
}
    
}