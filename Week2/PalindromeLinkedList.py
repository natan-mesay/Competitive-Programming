def isPalindrome(self, head: Optional[ListNode]) -> bool:
        fast = head
        slow = head

        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        prev = None
        while slow:
            curr = slow.next
            slow.next = prev
            prev = slow
            slow = curr

        left, right = head, prev
        while right:
            if left.val != right.val: 
                return False
            right = right.next
            left = left.next
        
        return True