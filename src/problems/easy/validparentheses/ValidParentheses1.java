package problems.easy.validparentheses;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses1 implements ValidParentheses {
    final String ROUND_PARENTHESES_LEFT = "(";
    final String ROUND_PARENTHESES_RIGHT = ")";
    final String CURLY_PARENTHESES_LEFT = "{";
    final String CURLY_PARENTHESES_RIGHT = "}";
    final String SQUARE_PARENTHESES_LEFT = "[";
    final String SQUARE_PARENTHESES_RIGHT = "]";

    @Override
    public boolean isValid(String s) {
        List<String> list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            String currentStr = s.substring(i, i + 1);
            if (isParentheseLeft(currentStr)) {
                list.add(currentStr);
            } else {
                if (list.isEmpty()) {
                    return false;
                }
                String listLastStr = list.get(list.size() - 1);
                String correctPartner = getCorrectPartner(currentStr);
                if (!listLastStr.equals(correctPartner)) {
                    return false;
                }
                list.remove(list.size() - 1);
            }
        }
        return list.isEmpty();
    }

    private boolean isParentheseLeft(String str) {
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