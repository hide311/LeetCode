package problems.medium.addtwonumbers;

//2ms
public class AddTwoNumbers1 implements AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) l1 = new ListNode(0);
        if (l2 == null) l2 = new ListNode(0);

        int sum = l1.val + l2.val;
        int val = sum % 10;

        if (sum >= 10) {
            if (l1.next == null && l2.next == null) {
                l1.next = new ListNode(1);
            } else if (l1.next != null) {
                l1.next.val++;
            } else if (l2.next != null) {
                l2.next.val++;
            }
        }
        ListNode answer = new ListNode(val);
        answer.next = addTwoNumbers(l1.next, l2.next);
        return answer;
    }
}