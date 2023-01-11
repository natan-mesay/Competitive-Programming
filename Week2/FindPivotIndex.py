class Solution:
    def pivotIndex(self, nums: List[int]) -> int:

        total = sum(nums)
        sumLeft = 0
        sumRight = 0

        for i in range(len(nums)):
            sumRight = total - nums[i] - sumLeft

            if sumRight == sumLeft:
                return i
            sumLeft += nums[i]
        return -1