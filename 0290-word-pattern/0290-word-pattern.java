class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        
        if(pattern.length()!=str.length) return false;
        
        HashMap<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet();
        System.out.println(Arrays.toString(str));
       
        
       for(int i=0; i<pattern.length(); i++){
           char ch = pattern.charAt(i);
           if(map.containsKey(ch)) {
               String mapstr =map.get(ch);
               
               if(!mapstr.equals(str[i])) return false;
               
           }
           else{
              if(set.contains(str[i]))return false;
               map.put(ch, str[i]);
               set.add(str[i]);
           }
       }
         System.out.println(map);
        
        return true;
    }
}