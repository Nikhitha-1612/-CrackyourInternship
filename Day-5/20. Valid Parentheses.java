class Solution {
    public boolean isValid(String s) {
           Deque<Character> stack = new LinkedList<>();
        for(int i = 0;i< s.length() ;i++){
            if(s.charAt(i) == ')'){
                if(stack.isEmpty() || (stack.pop() != '(')) return false;
            }else if(s.charAt(i) == ']'){
                if(stack.isEmpty() || (stack.pop() != '[')) return false;
            }else if(s.charAt(i) == '}'){
                if(stack.isEmpty() || (stack.pop() != '{')) return false;
            }else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
