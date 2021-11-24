package problems.easy.reverseInteger;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseInteger1Test {
    private ReverseInteger CreateReverseInteger() {
        return new ReverseInteger1();
    }

    @Test
    @Deprecated
    public void simpleTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = 123;
        int actual = reverseInteger.reverse(input);
        int expected = 321;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void minusNumTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = -123;
        int actual = reverseInteger.reverse(input);
        int expected = -321;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void endWithZeroTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = 120;
        int actual = reverseInteger.reverse(input);
        int expected = 21;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void zeroTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = 0;
        int actual = reverseInteger.reverse(input);
        int expected = 0;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void largerThanIntTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = 1534236469;
        int actual = reverseInteger.reverse(input);
        int expected = 0;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void SmallerThanIntTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = -2147483648;
        int actual = reverseInteger.reverse(input);
        int expected = 0;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void SmallerNumWithinIntTest() {
        ReverseInteger reverseInteger = CreateReverseInteger();
        int input = -2147483412;
        int actual = reverseInteger.reverse(input);
        int expected = -2143847412;
        assertThat(actual, is(expected));

    }


}