class Solution {
    public boolean isValid(String s) {
        // the origin solve method I did is using stack
        // stack is first in last out
        Stack<Character> stack = new Stack<>();
        boolean res = false;
        char[] strToChar = s.toCharArray();
        char single;
        for(int i = 0;i<strToChar.length;i++){
            single = strToChar[i];
            
            if(stack.isEmpty() && (single ==')' || single ==']' || single =='}')){
                res = false;
                stack.push(single);
                break;
            }
            
            if(single =='(' || single =='[' || single =='{'){
                stack.push(single);
            }
            else if(stack.peek() == '(' && single ==')'){
                stack.pop();
            }
            else if(stack.peek() == '[' && single ==']'){
                stack.pop();
            }
            else if(stack.peek() == '{' && single =='}'){
                stack.pop();
            }
            else{
                res = false;
                break;
            }
           
        }
        
        if(stack.isEmpty()){
            res = true;
        }
        
        return res;
    }
}