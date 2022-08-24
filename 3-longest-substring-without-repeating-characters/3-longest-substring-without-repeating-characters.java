class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        char[] ch = s.toCharArray();
        
       Set<Character> set = new HashSet<>();
        
        int i=0, j=1, max = 0, curmax= 1;
        set.add(ch[i]);
        while(j<ch.length){
            if(set.contains(ch[j])==false){
                curmax = j-i+1;
                max = Math.max(curmax, max);
                set.add(ch[j]);
                j++;
            }
            else if(set.contains(ch[j])==true){
                // set.add(ch[j]);
                max = Math.max(curmax, max);
                while(ch[i]!=ch[j]){
                    set.remove(ch[i]);
                    i++;
                }
                set.remove(ch[i]);
                i++;
                curmax = j-i+1;
                
                
            }
        }
        max = Math.max(curmax, max);
        return max;
        
    }
}