class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
               
                int value2= stack.pop();
                int value1= stack.pop();
                
                if(s.equals("+")){
                   int res =  value1+value2;
                stack.push(res);
                }
                else if(s.equals("-")){
                   int res =  value1-value2;
                    stack.push(res);
                }
                else if(s.equals("/")){
                   int res =  value1/value2;
                    stack.push(res);
                }
                else if(s.equals("*")){
                   int res =  value1*value2;
                    stack.push(res);
                }
                
            }
            else{
                
                int value= Integer.parseInt(s);
                stack.push(value);
                
            }
        }
        
        return stack.peek();
    }
}