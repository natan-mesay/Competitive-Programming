package Week2;

public class RemoveNthNodeFromEndofList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0,head);
        ListNode right = head;
        ListNode left = root;

        while(n > 0)
        {
            n--;
            right = right.next;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return root.next;
    }
}