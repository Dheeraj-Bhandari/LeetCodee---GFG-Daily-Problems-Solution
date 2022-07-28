class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(smap.containsKey(ch)){
                smap.put(ch, smap.getOrDefault(ch,1)+1);
            }
            else smap.put(ch,1);
        }
         for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(tmap.containsKey(ch)){
                tmap.put(ch, tmap.getOrDefault(ch,1)+1);
            }
            else tmap.put(ch,1);
        }
        if(smap.equals(tmap)) return true;
        else return false;
    }
}