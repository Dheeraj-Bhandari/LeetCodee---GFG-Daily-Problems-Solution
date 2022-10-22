class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char ch  =t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        HashMap <Character , Integer> map2 = new HashMap<>();
        int i =-1;
        int j =-1;
        String ans = "";
        int mct = 0;
        int dmct = t.length();

        while(true){
            boolean f1 = false;
            boolean f2 = false;

            while(i<s.length()-1 && mct<dmct){
                i++;
                char ch  =s.charAt(i);
                map2.put(ch, map2.getOrDefault(ch, 0)+1);
                if(map2.getOrDefault(ch,0)<=map.getOrDefault(ch,0)){
                    mct++;
                }
                f1= true;
            }

            while(j<i && mct==dmct ){
                String pans = s.substring(j+1, i+1);
                if(ans.length()==0 || pans.length()<ans.length()) ans = pans;
                j++;
                char ch = s.charAt(j);
                if(map2.get(ch)==1){
                    map2.remove(ch);
                }
                else map2.put(ch, map2.get(ch)-1);
                if(map2.getOrDefault(ch,0)<map.getOrDefault(ch,0)){
                    mct--;
                }
                f2=true;
            }
            if(f1==false && f2==false) break;
        }
        return ans;

    }
}