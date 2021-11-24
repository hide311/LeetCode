package problems.easy.palindromenumber;

public class PalindromeNumber1 implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder(Integer.toString(x));
            return x == Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            return false;
        }
    }
}