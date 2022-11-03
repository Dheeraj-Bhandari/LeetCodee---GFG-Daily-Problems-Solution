class Solution {
    public int longestPalindrome(String[] words) {
        
        HashMap<String , Integer> map = new HashMap<>();
        int ans = 0;
        for(String str:words){
            
            String reverse = ""+str.charAt(1)+str.charAt(0);
            if(map.containsKey(reverse)){
                ans+=4;
                map.put(reverse, map.get(reverse)-1);
                if(map.get(reverse)==0)map.remove(reverse);
            }
            else map.put(str, map.getOrDefault (str,0) +1);
        }
        
        for(char i='a'; i<='z'; i++){
            String str = ""+i+i;
           if(map.containsKey(str) && map.get(str)>0){
               ans+=2;
               break;
           }
        }
        return ans;
    }
}