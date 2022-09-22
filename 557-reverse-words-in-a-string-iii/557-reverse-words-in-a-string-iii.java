class Solution {
    public String reverseWords(String s) {
        // String[] str = s.split(" ");
        String temp = "";
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(i==s.length()-1){
                temp+=ch;
                ans+=reverse(temp);
            }
            else if(ch==' '){
                ans+=reverse(temp)+" ";
                temp="";
            }
            else{
                temp+=ch;
            }
        }
        return ans;
    }
    String reverse(String str){
        
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            ans+=str.charAt(i);
        }
        return ans;
    }
}