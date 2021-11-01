package problems.plusOne;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlusOneTest {
    private PlusOne createTestInstance() {
        return new PlusOne3();
    }

    @Test
    public void simpleTest() {
        PlusOne plusOne = createTestInstance();
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        int[] actual = plusOne.plusOne(input);

        assertThat(actual, is(expected));
    }

    @Test
    public void simpleTest2() {
        PlusOne plusOne = createTestInstance();
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] actual = plusOne.plusOne(input);

        assertThat(actual, is(expected));
    }

    @Test
    public void zeroTest() {
        PlusOne plusOne = createTestInstance();
        int[] input = {0};
        int[] expected = {1};
        int[] actual = plusOne.plusOne(input);

        assertThat(actual, is(expected));
    }

    @Test
    public void nineTest() {
        PlusOne plusOne = createTestInstance();
        int[] input = {9};
        int[] expected = {1, 0};
        int[] actual = plusOne.plusOne(input);

        assertThat(actual, is(expected));
    }

    @Test
    public void tenTest() {
        PlusOne plusOne = createTestInstance();
        int[] input = {1, 0};
        int[] expected = {1, 1};
        int[] actual = plusOne.plusOne(input);

        assertThat(actual, is(expected));
    }

    @Test
    public void ketaageTest() {
        PlusOne plusOne = createTestInstance();
        int[] input = {8, 9, 9, 9};
        int[] expected = {9, 0, 0, 0};
        int[] actual = plusOne.plusOne(input);

        assertThat(actual, is(expected));
    }

}