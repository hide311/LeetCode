package problems.easy.romanToInteger;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanToIntegerTest {
    private RomanToInteger createRomanToInteger() {
        return new RomanToInteger2();
    }

    @Test
    public void simpleTest() {
        RomanToInteger romanToInteger = createRomanToInteger();
        String input = "III";
        int expected = 3;
        int actual = romanToInteger.romanToInt(input);
        assertThat(expected, is(actual));
    }

    @Test
    public void substractWithTest() {
        RomanToInteger romanToInteger = createRomanToInteger();
        String input = "IX";
        int expected = 9;
        int actual = romanToInteger.romanToInt(input);
        assertThat(expected, is(actual));
    }


    @Test
    public void complicatedTest() {
        RomanToInteger romanToInteger = createRomanToInteger();
        String input = "MCMXCIV";
        int expected = 1994;
        int actual = romanToInteger.romanToInt(input);
        assertThat(expected, is(actual));
    }
}