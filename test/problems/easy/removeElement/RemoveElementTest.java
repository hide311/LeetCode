package problems.easy.removeElement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class RemoveElementTest {
    private RemoveElement CreateTestInstance() {
        return new RemoveElement1();
    }

    @Test
    public void simpleTest() {
        RemoveElement removeElement = CreateTestInstance();
        int[] inputNums = {3, 2, 2, 3};
        int inputVal = 3;
        int count = removeElement.removeElement(inputNums, inputVal);

        int expectedCount = 2;
        assertThat(count, is(expectedCount));
    }
}