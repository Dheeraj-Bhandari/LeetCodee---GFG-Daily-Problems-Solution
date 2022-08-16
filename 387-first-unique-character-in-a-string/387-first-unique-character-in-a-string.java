class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char [] ch  = s.toCharArray();
        for(char c :ch){
            map.put(c, map.getOrDefault(c , 0)+1);
        }
        
       for(int i=0; i<ch.length; i++){
           if(map.containsKey(ch[i])) {
               if(map.get(ch[i])<=1){
                   return i;
               }
           }
       }
        System.out.println(map);
        return -1;
    }
}