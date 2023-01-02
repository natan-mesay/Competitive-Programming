package Week1;
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null,curr = head, nxt =null;

        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;

    }
}
