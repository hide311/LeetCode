package problems.validParentheses;

import java.util.Stack;

public class ValidParentheses3 implements ValidParentheses {
    final String ROUND_PARENTHESES_LEFT = "(";
    final String ROUND_PARENTHESES_RIGHT = ")";
    final String CURLY_PARENTHESES_LEFT = "{";
    final String CURLY_PARENTHESES_RIGHT = "}";
    final String SQUARE_PARENTHESES_LEFT = "[";
    final String SQUARE_PARENTHESES_RIGHT = "]";

    @Override
    public boolean isValid(String s) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            String currentStr = s.substring(i, i + 1);
            if (isLeft(currentStr)) {
                stack.add(currentStr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                String lastStr = stack.pop();
                String correctPartner = getCorrectPartner(currentStr);
                if (!lastStr.equals(correctPartner)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeft(String str) {
        switch (str) {
            case ROUND_PARENTHESES_LEFT:
            case CURLY_PARENTHESES_LEFT:
            case SQUARE_PARENTHESES_LEFT:
                return true;
            default:
                return false;
        }
    }

    private String getCorrectPartner(String str) {
        switch (str) {
            case ROUND_PARENTHESES_RIGHT:
                return ROUND_PARENTHESES_LEFT;
            case CURLY_PARENTHESES_RIGHT:
                return CURLY_PARENTHESES_LEFT;
            case SQUARE_PARENTHESES_RIGHT:
                return SQUARE_PARENTHESES_LEFT;
            default:
                return "";
        }
    }

}