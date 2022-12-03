class Solution {
    

    
    public String frequencySort(String s) {
  
        HashMap<Character, Integer> map = new HashMap();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(map);
        String ans ="";
        
        List<Character>[] list = new List[s.length()+1];
        
        for(char ch : map.keySet()){
            
            int frq = map.get(ch);
           
           if(list[frq]==null){
               list[frq]=new ArrayList<>();
           }
            list[frq].add(ch);
  
        }
       for(List<Character>c:list){
           System.out.println(c);
       }
        for(int i =list.length-1; i>=0;  i-- ){
            if(list[i]!=null){
             
                for(char ch : list[i]){
                    for(int j=0; j<map.get(ch); j++){
                        ans+=ch;
                    }
                }
            }
        }
        
        return ans;
        
    }
}