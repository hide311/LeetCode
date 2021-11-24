package problems.easy.palindromeNumber;

public class PalindromeNumber5 implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reversed = 0;
        while (x > 0) {
            reversed *= 10;
            int pop = x % 10;
            reversed += pop;
            x /= 10;
        }
        return original == reversed;
    }
}