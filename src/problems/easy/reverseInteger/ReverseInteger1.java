package problems.easy.reverseInteger;

public class ReverseInteger1 implements ReverseInteger {
    public int reverse(int x) {
        if (x == 0 || x <= Integer.MIN_VALUE) {
            return 0;
        }
        StringBuffer sb = new StringBuffer();
        int plusMinusOne = x >= 0 ? 1 : -1;
        //マイナスの時でもStringBufferに詰めるため、一時的にプラスにする
        x = x * plusMinusOne;

        int tmp;
        while (x > 0) {
            if (!((tmp = x % 10) == 0 && sb.length() == 0)) {
                sb.append(tmp);
            }
            x /= 10;
        }
        String answerStr = sb.toString();
        if (isOutOfInteger(answerStr, plusMinusOne)) {
            return 0;
        }

        //NumberFormatExceptionを使えば、isOutOfIntegerはいらなくなる
        return Integer.parseInt(answerStr) * plusMinusOne;
    }

    private boolean isOutOfInteger(String answerStr, int plusMinusOne) {

        if (answerStr.length() > 10) {
            return true;
        } else if (answerStr.length() <= 9) {
            return false;
        } else {
            String nineFigureAnswerStr = answerStr.substring(0, 9);
            String lastFigureAnswerStr = answerStr.substring(9);

            String nineFigureIntMaxStr = "214748364";
            String lastFigureIntMaxStr = plusMinusOne >= 0 ? "7" : "8";
            if ((nineFigureAnswerStr.compareTo(nineFigureIntMaxStr) > 0) ||
                    ((nineFigureAnswerStr.compareTo(nineFigureIntMaxStr) == 0) && (lastFigureAnswerStr.compareTo(lastFigureIntMaxStr) > 0))) {
                return true;
            } else {
                return false;
            }

        }
    }

}