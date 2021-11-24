package problems.easy.strstr;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StrStrTest {
    private StrStr createTestInstance() {
        return new StrStr3();
    }

    @Test
    public void simpleTest() {
        StrStr strStr = createTestInstance();
        String haystack = "hello";
        String needle = "ll";
        int actual = strStr.strStr(haystack, needle);
        int expected = 2;
        assertThat(actual, is(expected));
    }

    @Test
    public void oneCharTest() {
        StrStr strStr = createTestInstance();
        String haystack = "a";
        String needle = "a";
        int actual = strStr.strStr(haystack, needle);
        int expected = 0;
        assertThat(actual, is(expected));
    }

    @Test
    public void complicatedTest() {
        StrStr strStr = createTestInstance();
        String haystack = "mississippi";
        String needle = "issip";
        int actual = strStr.strStr(haystack, needle);
        int expected = 4;
        assertThat(actual, is(expected));
    }

}