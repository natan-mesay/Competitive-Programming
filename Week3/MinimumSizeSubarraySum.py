class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        sums, left = 0, 0
        answer = float("inf")

        for i in range(len(nums)):
            sums += nums[i]
            while sums >= target:
                answer = min(answer, i - left + 1)
                sums -= nums[left]
                left += 1
                        
        return answer if answer != float("inf") else 0