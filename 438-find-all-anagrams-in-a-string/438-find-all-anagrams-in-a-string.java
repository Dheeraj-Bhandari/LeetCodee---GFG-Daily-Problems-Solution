class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list =new ArrayList<>();
        if(s.length()<p.length()) return list;
    Map<Character, Integer> smap = new HashMap<>();
    Map<Character, Integer> pmap = new HashMap<>();
        
     for(int i=0; i<p.length(); i++){
        char ch = p.charAt(i);
        pmap.put(ch, pmap.getOrDefault(ch,0)+1);
    }  
  
    for(int i=0; i<p.length(); i++){
        char ch = s.charAt(i);
        smap.put(ch, smap.getOrDefault(ch,0)+1);
    }
    
    int i=p.length();
        while(i<s.length()){
            if(smap.equals(pmap)==true){
                list.add(i-p.length());
            }
             char ch1 = s.charAt(i);
            smap.put(ch1 , smap.getOrDefault(ch1,0)+1);
            
            
                char ch2 = s.charAt(i-p.length());
                if(smap.get(ch2)==1){
                    smap.remove(ch2);
                }
                else{
                    smap.put(ch2, smap.getOrDefault(ch2, 0)-1);
                }
            
            i++;
        }
        
        if(smap.equals(pmap)==true){
                list.add(i-p.length());
            }
        return list;

    }
    
}