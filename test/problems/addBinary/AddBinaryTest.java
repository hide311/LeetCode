package problems.addBinary;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AddBinaryTest {
    private AddBinary createTestInstance() {
        return new AddBinary3();
    }

    @Test
    public void onePlusThreeTest() {
        AddBinary addBinary = createTestInstance();

        String inputA = "11";
        String inputB = "1";
        String expected = "100";
        String actual = addBinary.addBinary(inputA, inputB);
        assertThat(actual, is(expected));
    }

    @Test
    public void elevenPlusTwelveTest() {
        AddBinary addBinary = createTestInstance();

        String inputA = "1010";
        String inputB = "1011";
        String expected = "10101";
        String actual = addBinary.addBinary(inputA, inputB);
        assertThat(actual, is(expected));
    }

    @Test
    public void fifteenPlusFifteenTest() {
        AddBinary addBinary = createTestInstance();

        String inputA = "1111";
        String inputB = "1111";
        String expected = "11110";
        String actual = addBinary.addBinary(inputA, inputB);
        assertThat(actual, is(expected));
    }
}