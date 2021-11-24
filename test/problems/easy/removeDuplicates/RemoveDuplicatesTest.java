package problems.easy.removeDuplicates;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveDuplicatesTest {
    private RemoveDuplicates createTestInstance() {
        return new RemoveDuplicates4();
    }

    @Test
    @Deprecated
    public void simpleTest() {
        RemoveDuplicates removeDuplicates = createTestInstance();
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int actual = removeDuplicates.removeDuplicates(input);
        int expected = 5;
        assertThat(actual, is(expected));
    }

    @Test
    @Deprecated
    public void onlySameNumTest() {
        RemoveDuplicates removeDuplicates = createTestInstance();
        int[] input = {1, 1};
        int actual = removeDuplicates.removeDuplicates(input);
        int expected = 1;
        assertThat(actual, is(expected));
    }

}