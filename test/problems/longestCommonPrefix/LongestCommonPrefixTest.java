package problems.longestCommonPrefix;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class LongestCommonPrefixTest {
    public LongestCommonPrefix createLongestCommonPrefix() {
        return new LongestCommonPrefix1();
    }

    @Test
    public void simpleTest() {
        LongestCommonPrefix longestCommonPrefix = createLongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = longestCommonPrefix.longestCommonPrefix(input);
        assertThat(expected, is(actual));
    }

    @Test
    public void noMatchTest() {
        LongestCommonPrefix longestCommonPrefix = createLongestCommonPrefix();
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        String actual = longestCommonPrefix.longestCommonPrefix(input);
        assertThat(expected, is(actual));
    }

    @Test
    public void notPrefixTest() {
        LongestCommonPrefix longestCommonPrefix = createLongestCommonPrefix();
        String[] input = {"c", "acc", "ccc"};
        String expected = "";
        String actual = longestCommonPrefix.longestCommonPrefix(input);
        assertThat(expected, is(actual));
    }

}