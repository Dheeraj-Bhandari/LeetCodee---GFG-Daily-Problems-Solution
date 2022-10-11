class TriNode{
     TriNode[] childern = new TriNode[26];
    boolean isEnd = false;
}

class Trie {
   
    TriNode root;
    
    public Trie() {
        root = new TriNode();    
    }
    
    public void insert(String word) {
        TriNode node = root;
        for(int i=0; i<word.length(); i++){
            char c =word.charAt(i);
            if(node.childern[c-'a']==null){
                node.childern[c-'a']=new TriNode();
            }
            node=node.childern[c-'a'];
        }
        node.isEnd = true;
    }
    
    public boolean search(String word) {
        TriNode node = root;
        for(int i=0; i<word.length();i++){
            char c = word.charAt(i);
            if(node.childern[c-'a']==null) return false;
            node= node.childern[c-'a'];
            
        }
        return node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TriNode node = root;
        
        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if(node.childern[c-'a']==null) return false;
            node= node.childern[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */