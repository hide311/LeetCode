package problems.easy.romantointeger;

public class RomanToInteger2 implements RomanToInteger {
    @Override
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            Roman leftRoman = Roman.valueOf(s.substring(i, i + 1));
            int leftNum = leftRoman.number;
            if (isLastChar(i, s)) {
                answer += leftNum;
                break;
            }

            Roman rightRoman = Roman.valueOf(s.substring(i + 1, i + 2));
            int rightNum = rightRoman.number;
            if (leftNum < rightNum) {
                answer -= leftNum;
            } else {
                answer += leftNum;
            }
        }
        return answer;
    }

    private boolean isLastChar(int i, String s) {
        return (i == s.length() - 1);
    }

    private enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int number;

        Roman(int number) {
            this.number = number;
        }
    }
}