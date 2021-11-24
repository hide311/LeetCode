package problems.easy.searchInsert;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchInsertTest {
    private SearchInsert createTestInstance() {
        return new SearchInsert2();
    }

    @Test
    public void simpleTest() {
        SearchInsert searchInsert = createTestInstance();
        int[] inputNums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        int actual = searchInsert.searchInsert(inputNums, target);
        assertThat(actual, is(expected));
    }

    @Test
    public void targetInNumsTest() {
        SearchInsert searchInsert = createTestInstance();
        int[] inputNums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int actual = searchInsert.searchInsert(inputNums, target);
        assertThat(actual, is(expected));
    }

    @Test
    public void largerThanNumsTest() {
        SearchInsert searchInsert = createTestInstance();
        int[] inputNums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        int actual = searchInsert.searchInsert(inputNums, target);
        assertThat(actual, is(expected));
    }


}