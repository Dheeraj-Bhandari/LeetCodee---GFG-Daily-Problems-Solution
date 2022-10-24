class Solution {
    public int maxLength(List<String> arr) {
     List<String> ansList = new ArrayList<>();
        int ans =0;

        ansList.add("");
        for(String str : arr){
            if(checkStr(str)==false){
                List<String> newAnsList = new ArrayList<>();
                for(String candidate : ansList){
                    String temp = str+candidate;
                    if(checkStr(temp)==false){
                        ans= Math.max(temp.length(), ans);
                        newAnsList.add(temp);
                    }
                }

            ansList.addAll(newAnsList);
            }
        }
        return ans;
    }
    boolean checkStr(String str){
        int[] arr = new int [26];

        for(char c:str.toCharArray()){
            arr[c-'a']++;
            if(arr[c-'a']>1)return true;
        }
        return false;
    }
}