package problems.easy.deleteduplicates;

//0ms
//後ろから消していく
public class DeleteDuplicates1 implements DeleteDuplicates {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next != null) {
            deleteDuplicates(head.next);
        }

        ListNode nextNode = head.next;
        if (nextNode != null && head.val == nextNode.val) {
            head.next = nextNode.next;
        }
        return head;
    }
}