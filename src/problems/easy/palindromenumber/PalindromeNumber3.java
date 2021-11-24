package problems.easy.palindromenumber;

public class PalindromeNumber3 implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = Integer.toString(x);
        int fromRight = xStr.length();

        for (int i = 0; i < xStr.length() / 2; i++) {
            String strLeft = xStr.substring(i, i + 1);
            String strRight = xStr.substring(fromRight - 1, fromRight);
            if (!strLeft.equals(strRight)) {
                return false;
            }
            fromRight--;
        }
        return true;
    }
}