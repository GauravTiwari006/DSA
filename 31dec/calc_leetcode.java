class Solution {
    public int calculate(String s) {
        
        =<Integer> stack = new LinkedList<>();
        stack.offerLast(1);
        // stack store the sign right before the next block(subexpression)
        
        int res = 0;
        int num = 0;
        int sign = 1;
        for(char c : s.toCharArray()){
            if(c == ' ') continue;
            else if(Character.isDigit(c)){
                num = num * 10 + (c -  '0');
            }else if(c == '('){
                stack.offer(sign);
            }else if(c == ')'){                                                                               
                stack.pollLast();
            }else{
                // if it is an operator, means we have found a whole number, add to result
                // this number actually is the number after expand the string or remove all paarentheses 
                res += sign * num;
                // prepare sign for the next number, sign before this block * sign in this block
                sign = stack.peekLast() * (c == '+' ? 1 : -1);
                num = 0;
            }
        }
        res += sign * num;
        return res;
    }
}