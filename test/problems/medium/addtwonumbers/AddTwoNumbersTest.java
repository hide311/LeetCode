package problems.medium.addtwonumbers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AddTwoNumbersTest {
    private AddTwoNumbers createTestInstance() {
        return new AddTwoNumbers2();
    }

    @Test
    public void simpleTest() {
        AddTwoNumbers addTwoNumbers = createTestInstance();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        check(actual, expected);
    }

    @Test
    public void zeroTest() {
        AddTwoNumbers addTwoNumbers = createTestInstance();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(0);

        check(actual, expected);
    }

    @Test
    public void differentDigitsTest() {
        AddTwoNumbers addTwoNumbers = createTestInstance();
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        check(actual, expected);
    }

    @Test
    public void complicatedTest() {
        AddTwoNumbers addTwoNumbers = createTestInstance();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(4, new ListNode(0, new ListNode(1)))));

        check(actual, expected);
    }

    private void check(ListNode actual, ListNode expected) {
        while (actual.next != null) {
            assertThat(actual.val, is(expected.val));
            actual = actual.next;
            expected = expected.next;
        }
    }
}