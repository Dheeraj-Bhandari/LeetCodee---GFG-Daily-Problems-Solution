class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set  = new HashSet<>();
        
        for(String s:words){
            StringBuilder sb = new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(str[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}