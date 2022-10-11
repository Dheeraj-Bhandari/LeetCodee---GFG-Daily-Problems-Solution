class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(!wordList.contains(endWord)) return 0;
        
        HashMap<String, Boolean> vmap = new HashMap<>();
        
        for(int i=0; i<wordList.size(); i++){
            vmap.put(wordList.get(i), false);
        }
        
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int length = 1;
        vmap.put(beginWord, true);
        
        while(q.size()>0){
            int size = q.size();
            for(int i=0; i<size; i++){
                String temp = q.poll();
                if(temp.equals(endWord)) return length;
                
                wordMatch(temp, q, vmap);
            }
            length++;
        }
        return 0;
    }
    void wordMatch(String temp , Queue<String> q, HashMap<String, Boolean> vmap){
        for(int i=0; i<temp.length(); i++){
            char[] ch = temp.toCharArray();
            for(int j=0; j<26; j++){
                char c = (char)('a'+j);
                ch[i]= c;
                String str = String.valueOf(ch);
                if(vmap.containsKey(str)&&vmap.get(str)==false){
                    q.add(str);
                    vmap.put(str, true);
                }
            }
        }
    }
}