package problems.easy.mergeTwoLists;

public class MergeTwoLists1 implements MergeTwoLists {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode merged = new ListNode();
        doSomething(merged, l1, l2);

        return merged;
    }

    private void doSomething(ListNode merged, ListNode l1, ListNode l2) {
        if (l1 == null) {
            merged.val = l2.val;
            l2 = l2.next;
        } else if (l2 == null) {
            merged.val = l1.val;
            l1 = l1.next;
        } else if (l1.val <= l2.val) {
            merged.val = l1.val;
            l1 = l1.next;
        } else if (l2.val < l1.val) {
            merged.val = l2.val;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null) {
            return;
        }
        merged.next = new ListNode();
        doSomething(merged.next, l1, l2);
    }
}