class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
       if(s.charAt(0)==t.charAt(0)) return isSubsequence(s.substring(1), t.substring(1));
        else return isSubsequence (s, t.substring(1));
    }
}