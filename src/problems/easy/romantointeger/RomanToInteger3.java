package problems.easy.romantointeger;

public class RomanToInteger3 implements RomanToInteger {
    final int I_VALUE = 1;
    final int V_VALUE = 5;
    final int X_VALUE = 10;
    final int L_VALUE = 50;
    final int C_VALUE = 100;
    final int D_VALUE = 500;
    final int M_VALUE = 1000;

    @Override
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int leftNum = getNumberFromRoman(s.charAt(i));
            if (i == s.length() - 1) {
                answer += leftNum;
                break;
            }

            int rightNum = getNumberFromRoman(s.charAt(i + 1));
            if (leftNum < rightNum) {
                answer -= leftNum;
            } else {
                answer += leftNum;
            }
        }
        return answer;
    }

    private int getNumberFromRoman(char romanChar) {
        switch (romanChar) {
            case 'I':
                return I_VALUE;
            case 'V':
                return V_VALUE;
            case 'X':
                return X_VALUE;
            case 'L':
                return L_VALUE;
            case 'C':
                return C_VALUE;
            case 'D':
                return D_VALUE;
            case 'M':
                return M_VALUE;
            default:
                return 0;
        }
    }
}