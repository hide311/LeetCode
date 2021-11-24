package problems.easy.palindromeNumber;

public class PalindromeNumber4 implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int xDigit = String.valueOf(x).length();
        int placeLeft = (int) Math.pow(10, xDigit - 1);
        for (int i = 1; i <= xDigit / 2; i++) {
            int leftNum = x / placeLeft;
            if (leftNum >= 10) {
                leftNum %= 10;
            }

            int placeRight = (int) Math.pow(10, i);
            int extra = x % placeRight;
            int rightNum = extra / (int) Math.pow(10, i - 1);

            if (leftNum != rightNum) {
                return false;
            }
            placeLeft /= 10;
        }
        return true;
    }
}