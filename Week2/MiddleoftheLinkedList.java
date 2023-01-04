package Week2;

public class MiddleoftheLinkedList{
    public ListNode middleNode(ListNode head) {
        ListNode output = head;
        int mid = 0;

        while(output != null){
            mid++;
            output = output.next;
        }
        output = head;
        mid /= 2;
        while(mid != 0){
            mid--;
            output = output.next;

        }
        
        return output;

    }
}