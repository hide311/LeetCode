package problems.sqrt;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MySqrtTest {
    private MySqrt createTestInstance() {
        return new MySqrt2();
    }

    @Test
    public void simpleTest() {
        MySqrt mySqrt = createTestInstance();
        int input = 15;
        int expected = 3;
        int actual = mySqrt.mySqrt(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void oneTest() {
        MySqrt mySqrt = createTestInstance();
        int input = 1;
        int expected = 1;
        int actual = mySqrt.mySqrt(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void zeroTest() {
        MySqrt mySqrt = createTestInstance();
        int input = 0;
        int expected = 0;
        int actual = mySqrt.mySqrt(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void nineTest() {
        MySqrt mySqrt = createTestInstance();
        int input = 9;
        int expected = 3;
        int actual = mySqrt.mySqrt(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void eightTest() {
        MySqrt mySqrt = createTestInstance();
        int input = 8;
        int expected = 2;
        int actual = mySqrt.mySqrt(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void complicatedTest() {
        MySqrt mySqrt = createTestInstance();
        int input = 2147395599;
        int expected = 46339;
        int actual = mySqrt.mySqrt(input);
        assertThat(actual, is(expected));
    }
}