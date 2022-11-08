class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && Character.isUpperCase(ch) && Character.isLowerCase(stack.peek())
               && Character.toLowerCase(ch)==(stack.peek())){
                stack.pop();
            }
            else if(!stack.isEmpty() && Character.isLowerCase(ch) && Character.isUpperCase(stack.peek())
                    && Character.toLowerCase(stack.peek())==(ch)){
                stack.pop();
            }
            else stack.push(ch);
        }
        char[] ch = new char[stack.size()];
        int i = stack.size()-1;
        while(stack.size()>0){
            ch[i]= stack.peek();
            stack.pop();
            i--;
        }
        return String.valueOf(ch);
    }
}