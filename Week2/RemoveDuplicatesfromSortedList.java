package Week2;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode curr = head;

        if(head == null)
            return head;
        while(curr != null)
        {
            if( prev.val != curr.val)
            {
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        prev.next = null;
        return head;

    }
}
