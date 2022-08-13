class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map =new HashMap<>();
       
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
                map.put(ch, map.getOrDefault(ch , 0)+1);
        }
        int max = 0;
        boolean even = false;
        for(int c : map.values()){
            if(c%2==0){
            max+=c;
            }
            else if(c%2==1){
                max+=c-1;
                even = true;
            }
        }
        System.out.println(map);
        return even==false? max : max+1;
    }
}