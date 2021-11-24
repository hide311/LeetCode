package problems.easy.palindromeNumber;

public class PalindromeNumber2 implements PalindromeNumber {
    @Override
    //xは不変にした方が良さそう
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int xDigit = String.valueOf(x).length();
        int placeFromLeft = (int) Math.pow(10, xDigit - 1);
        for (int i = 0; i < xDigit / 2; i++) {
            int leftNum = x / placeFromLeft;
            if (leftNum >= 10) {
                leftNum %= 10;
            }

            int rightNum = x % 10;

            if (leftNum != rightNum) {
                return false;
            }
            placeFromLeft /= 100;
            x /= 10;
        }
        return true;
    }
}