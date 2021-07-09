package problems.reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        StringBuffer sb = new StringBuffer();

        int plusMinusOne = x >= 0 ? 1 : -1;
        //マイナスの時でもStringBufferに詰めるため、一時的にプラスにする
        x = x * plusMinusOne;

        int tmp;
        while (x > 0){
            if (!((tmp = x % 10) == 0 && sb.length() == 0)) {
                sb.append(tmp);
            }
            x /= 10;
        }
        return Integer.parseInt(sb.toString()) * plusMinusOne;
    }
}
