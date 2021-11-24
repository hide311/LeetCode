package problems.easy.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses2 implements ValidParentheses {
    Map<Character, Character> map = new HashMap();

    @Override
    public boolean isValid(String s) {
        prepareMap();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);

            if (map.containsValue(sChar)) {
                stack.add(sChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (map.get(sChar) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private void prepareMap() {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }
}