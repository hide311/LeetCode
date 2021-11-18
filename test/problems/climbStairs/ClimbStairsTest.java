package problems.climbStairs;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ClimbStairsTest {
    private ClimbStairs createTestInstance() {
        return new ClimbStairs3();
    }

    @Test
    public void oneTest() {
        ClimbStairs climbStairs = createTestInstance();
        int input = 1;
        int expected = 1;
        int actual = climbStairs.climbStairs(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void twoTest() {
        ClimbStairs climbStairs = createTestInstance();
        int input = 2;
        int expected = 2;
        int actual = climbStairs.climbStairs(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void threeTest() {
        ClimbStairs climbStairs = createTestInstance();
        int input = 3;
        int expected = 3;
        int actual = climbStairs.climbStairs(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void fourTest() {
        ClimbStairs climbStairs = createTestInstance();
        int input = 4;
        int expected = 5;
        int actual = climbStairs.climbStairs(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void fourtyThreeTest() {
        ClimbStairs climbStairs = createTestInstance();
        int input = 43;
        int expected = 701408733;
        int actual = climbStairs.climbStairs(input);
        assertThat(actual, is(expected));
    }

}