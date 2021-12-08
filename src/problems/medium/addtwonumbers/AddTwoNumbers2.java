package problems.medium.addtwonumbers;

public class AddTwoNumbers2 implements AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = getLongestListNode(l1, l2);
        ListNode ll = l;

        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = val1 + val2;
            int val = sum % 10;
            l.val = val;

            ListNode l1Next = l1 != null ? l1.next : null;
            ListNode l2Next = l2 != null ? l2.next : null;
            if (sum >= 10) {
                if (l1Next == null && l2Next == null) {
                    l.next = new ListNode(1);
                } else if (l1Next != null) {
                    l1Next.val++;
                } else {
                    l2Next.val++;
                }
            }
            l = l.next;
            l1 = l1Next;
            l2 = l2Next;
        }
        return ll;
    }

    private ListNode getLongestListNode(ListNode l1, ListNode l2) {
        ListNode l1_tmp = l1;
        ListNode l2_tmp = l2;
        while (l1_tmp != null && l2_tmp != null) {
            l1_tmp = l1_tmp.next;
            l2_tmp = l2_tmp.next;
        }

        if (l1_tmp == null) {
            return l2;
        } else {
            return l1;
        }
    }
}