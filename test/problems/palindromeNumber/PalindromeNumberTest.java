package problems.palindromeNumber;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PalindromeNumberTest {
    public PalindromeNumber createPalindromNumber() {
        return new PalindromeNumber3();
    }

    @Test
    public void simpleTrueTest() {
        PalindromeNumber palindromeNumber = createPalindromNumber();
        int input = 121;
        boolean actual = palindromeNumber.isPalindrome(input);
        boolean expected = true;
        assertThat(actual, is(expected));
    }

    @Test
    public void simpleFalseTest() {
        PalindromeNumber palindromeNumber = createPalindromNumber();
        int input = 123;
        boolean actual = palindromeNumber.isPalindrome(input);
        boolean expected = false;
        assertThat(actual, is(expected));
    }

    @Test
    public void minusTest() {
        PalindromeNumber palindromeNumber = createPalindromNumber();
        int input = -123;
        boolean actual = palindromeNumber.isPalindrome(input);
        boolean expected = false;
        assertThat(actual, is(expected));
    }

    @Test
    public void largerThanMaxIntTest() {
        PalindromeNumber palindromeNumber = createPalindromNumber();
        int input = 1234567899;
        boolean actual = palindromeNumber.isPalindrome(input);
        boolean expected = false;
        assertThat(actual, is(expected));
    }

    @Test
    public void xWithZeroTest() {
        PalindromeNumber palindromeNumber = createPalindromNumber();
        int input = 1001;
        boolean actual = palindromeNumber.isPalindrome(input);
        boolean expected = true;
        assertThat(actual, is(expected));
    }

}