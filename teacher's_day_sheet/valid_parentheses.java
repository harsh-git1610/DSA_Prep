class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char d  : s.toCharArray()){
            if(d == '(' || d == '{' || d == '['){
                stack.push(d) ; 
            }
            else{
                if(stack.isEmpty() || !match(stack.pop() , d)){
                    return false ; 
                }
            }
        } return stack.isEmpty() ; 
        
    }
    public boolean match(char left , char right){
        if(left == '(' && right == ')'){
            return true ; 
        }
        if(left == '{' && right == '}'){
            return true ; 
        }
        if(left == '[' && right == ']'){
            return true ; 
        }
        else
        return false ; 
    }
}
