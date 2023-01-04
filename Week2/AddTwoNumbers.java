package Week2;
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode root = new ListNode(0);
        ListNode curr = root;

        int carry = 0;
        while(l1 != null || l2 != null || carry !=0)
        {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = carry + v1 + v2;
            carry = sum / 10;
            int current_sum = sum % 10;

            ListNode l3 = new ListNode(current_sum);
            curr.next = l3;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            curr = curr.next;
        }

        return root.next;
    }
}
