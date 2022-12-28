package Week1;

import java.util.HashMap;
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> sq = new Stack<>();
        HashMap<Character,Character> sets = new HashMap<>();

        sets.put('}', '{'); 
        sets.put(')', '('); 
        sets.put(']', '['); 


        char [] xy = s.toCharArray();

        for (int i = 0; i < xy.length; i++) {
            if(xy[i] == '{' || xy[i] == '(' || xy[i] == '['){
                sq.push(xy[i]);
            }
            
            else{
                if(sq.empty())
                    return false;
                else if(sq.peek() == sets.get(xy[i]))
                    sq.pop();
                else
                    return false;
            }
        }
        return sq.empty();
    }
}
