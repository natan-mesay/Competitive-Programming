package Week1;

import java.util.HashMap;
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> sq = new Stack<>();
        HashMap<Character,Character> sets = new HashMap<>();

        char [] xy = s.toCharArray();

        for (int i = 0; i < xy.length; i++) {
            if(xy[i] == '}'){
                sq.pop();
            }
        }
        return false;
    }
}
