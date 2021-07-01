package twoSum;

import org.junit.Test;
import problems.twoSum.TwoSum3;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TwoSumTest {
    @Test @Deprecated
    public void simpleTwoSum(){
        TwoSum3 twoSum3 = new TwoSum3();
        int[] nums =  {2,7,11,15};
        int[] actual = twoSum3.twoSum(nums, 9);

        //containsInAnyOrderなどの並び順を無視したテストケースの書き方がわからないので、ひとまずこちらで...
        int[] actualSorted = Arrays.stream(actual).sorted().toArray();
        int[] expected = {0, 1};

        assertThat(actualSorted, is(expected));
    }
}