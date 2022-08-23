class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch: s.toCharArray()) {
            if (ch != ']') {
                stack.push(ch);
            }
            else {
                String subStr = "";
                
                while (stack.peek() != '[') {
                    subStr = stack.pop() + subStr;
                }
                stack.pop();
                
                String num = "";
                
                while (!stack.empty() && Character.isDigit(stack.peek())) {
                    num = stack.pop() + num;
                }
                for (char c: new String(new char[Integer.valueOf(num)]).replace("\0", subStr).toCharArray()) {
                    stack.push(c);
                }
                
            }
        }
        while (!stack.empty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}