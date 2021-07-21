package problems.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger1 implements RomanToInteger {
    Map<String, Integer> map = new HashMap<>();

    @Override
    public int romanToInt(String s) {
        prepareMap();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int leftNum = map.get(s.substring(i, i + 1));
            if (isLastChar(i, s)) {
                answer += leftNum;
                break;
            }

            int rightNum = map.get(s.substring(i + 1, i + 2));
            if (leftNum < rightNum) {
                answer -= leftNum;
            } else {
                answer += leftNum;
            }
        }
        return answer;
    }

    private void prepareMap() {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }

    private boolean isLastChar(int i, String s) {
        return (i == s.length() - 1);
    }
}