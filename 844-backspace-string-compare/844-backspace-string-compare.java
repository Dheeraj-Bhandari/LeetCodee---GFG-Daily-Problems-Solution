class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            if(!stack.isEmpty() && ch[i]=='#'){
                stack.pop();
            }
            // else if(ch[i]!='#' && stack.isEmpty()){
            //     continue;
            // }
            else if(ch[i]!='#'){
                stack.push(ch[i]);
            }
        }
          for(int i=0; i<ch2.length; i++){
            if(!stack2.isEmpty() && ch2[i]=='#'){
                stack2.pop();
            }
            
            else if(ch2[i]!='#'){
                stack2.push(ch2[i]);
            }
        }
        System.out.println(stack);
        System.out.println(stack2);
        return stack.equals(stack2);
    }
}