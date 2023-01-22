class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        checkdfs(list, new ArrayList<String>(), s);
        return list;
    }
    
    void checkdfs(List<List<String>> list, List<String> curList, String s){
        if(s.length()==0){
            list.add(new ArrayList<String>(curList));
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            if(checkPalin(s, 0, i)){
                curList.add(s.substring(0,i+1));
                checkdfs(list, curList, s.substring(i+1));
                curList.remove(curList.size()-1);
            }
        }
    }
    
    boolean checkPalin(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++; j--;
        }
        return true;
    }

}