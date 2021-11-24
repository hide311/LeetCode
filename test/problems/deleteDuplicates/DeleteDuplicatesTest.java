package problems.deleteDuplicates;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DeleteDuplicatesTest {
    private DeleteDuplicates createTestInstance() {
        return new DeleteDuplicates1();
    }

    @Test
    public void oneTest() {
        DeleteDuplicates deleteDuplicates = createTestInstance();
        ListNode input = new ListNode(1);
        ListNode expected = new ListNode(1);
        ListNode actual = deleteDuplicates.deleteDuplicates(input);

        check(actual, expected);
    }

    @Test
    public void oneTwoTest() {
        DeleteDuplicates deleteDuplicates = createTestInstance();
        ListNode input = new ListNode(1, new ListNode(2));
        ListNode actual = deleteDuplicates.deleteDuplicates(input);

        ListNode expected = new ListNode(1, new ListNode(2));
        check(actual, expected);
    }

    @Test
    public void oneOneOneTest() {
        DeleteDuplicates deleteDuplicates = createTestInstance();
        ListNode input = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode actual = deleteDuplicates.deleteDuplicates(input);

        ListNode expected = new ListNode(1);
        check(actual, expected);

    }

    @Test
    public void oneOneTwoTest() {
        DeleteDuplicates deleteDuplicates = createTestInstance();
        ListNode input = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode actual = deleteDuplicates.deleteDuplicates(input);

        ListNode expected = new ListNode(1, new ListNode(2));
        check(actual, expected);
    }

    @Test
    public void oneOneTwoThreeThreeTest() {
        DeleteDuplicates deleteDuplicates = createTestInstance();
        ListNode input = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode actual = deleteDuplicates.deleteDuplicates(input);

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        check(actual, expected);
    }

    @Test
    public void nullTest() {
        DeleteDuplicates deleteDuplicates = createTestInstance();
        ListNode input = null;
        ListNode actual = deleteDuplicates.deleteDuplicates(input);

        ListNode expected = null;
        check(actual, expected);
    }

    private void check(ListNode actual, ListNode expected) {
        while (expected != null) {
            assertThat(actual.val, is(expected.val));
            actual = actual.next;
            expected = expected.next;
        }

        while (actual != null) {
            assertThat(actual.val, is(expected.val));
            actual = actual.next;
            expected = expected.next;
        }

    }
}