def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, curr = dummy, head

        while curr and curr.next:
            # curr is the first element
            second = curr.next
            nextPair = curr.next.next

            second.next = curr
            curr.next = nextPair
            prev.next = second

            #assigning curr to the next first element to be swapped
            #prev assing to the next element that point the curr
            prev = curr
            curr = nextPair

        return dummy.next