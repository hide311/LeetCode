package problems.easy.mergeTwoLists;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MergeTwoListsTest {
    private MergeTwoLists createMergeTwoLists() {
        return new MergeTwoLists1();
    }

    private void compareAnswer(ListNode actual, ListNode expected) {
        while (actual != null && expected != null) {
            assertThat(actual.val, is(expected.val));
            actual = actual.next;
            expected = expected.next;
        }
    }

    @Test
    public void simpleTest() {
        MergeTwoLists mergeTwoLists = createMergeTwoLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode actual = mergeTwoLists.mergeTwoLists(l1, l2);
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode((4)))))));
        compareAnswer(actual, expected);
    }

    @Test
    public void emptyTest() {
        MergeTwoLists mergeTwoLists = createMergeTwoLists();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        ListNode actual = mergeTwoLists.mergeTwoLists(l1, l2);
        ListNode expected = new ListNode();
        compareAnswer(actual, expected);
    }

    @Test
    public void halfEmptyTest() {
        MergeTwoLists mergeTwoLists = createMergeTwoLists();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(0);

        ListNode actual = mergeTwoLists.mergeTwoLists(l1, l2);
        ListNode expected = new ListNode();
        compareAnswer(actual, expected);
    }
}