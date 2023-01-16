class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()

        l, r = 0, len(people) - 1
        count = 0
        while l <= r:
            count += 1
            if people[r] + people[l] <= limit:
                l += 1
            r -= 1
        return count