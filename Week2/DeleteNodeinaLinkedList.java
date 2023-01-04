package Week2;

public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        ListNode prev = node.next;

        node.val = prev.val;
        node.next = prev.next;
    }
}
