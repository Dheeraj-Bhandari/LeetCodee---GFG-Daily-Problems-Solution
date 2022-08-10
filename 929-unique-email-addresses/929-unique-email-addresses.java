class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>  set =  new HashSet<>();
        
        for(int i=0; i<emails.length; i++){
            set.add(findvalidemail(emails[i]));
        }
        System.out.println(set);
        return set.size();
    }
    String findvalidemail(String s){
        String temp = "";
        int seprater = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='@'){
                seprater = i;
                break;
            }
        }
        for(int i=0; i<seprater; i++){
            if(s.charAt(i)=='.') continue;
            else if(s.charAt(i)=='+') break;
            else{
                temp+=s.charAt(i);
            }
        }
        temp+='@';
        for(int i=seprater+1; i<s.length(); i++){
            temp+=s.charAt(i);
        }
        return temp;
    }
}