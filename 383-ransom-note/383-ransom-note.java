class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map  =new HashMap<>();
        char [] ch  = ransomNote.toCharArray();
        char [] ch2  = magazine.toCharArray();
        for(char c:ch2){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<ch.length; i++){
            if(map.containsKey(ch[i])){
                if(map.get(ch[i])>0){
                    map.put(ch[i], map.getOrDefault(ch[i], 0)-1);
                }
                else return false;
            }
            else return false;
        }
        return true;
    }
}